package ActiveRecord4k

import entity.Column

/**
 * Created by icepoint1999 on 27/05/2017.
 */
class User : ActiveRecord<User>() {

    var name by Column();


}