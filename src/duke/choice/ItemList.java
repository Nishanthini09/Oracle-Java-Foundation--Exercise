/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author nishanthinim
 */

public class ItemList implements Handler {
    private Clothing item[];
    ItemList(Clothing item[]){
        this.item = item;
    }
    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status (Http.Status.OK_200);
        res.headers().put("Content-Type","text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for(Clothing items:item){
            result.append(items+"\n");
        }
        res.send(result);
    }
}
