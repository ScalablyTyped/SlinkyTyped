package typingsSlinky.smartFoxServer.global.SFS2X.Requests

import typingsSlinky.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typingsSlinky.smartFoxServer.SFS2X.Entities.MMORoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region MMO
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.MMO.html
@JSGlobal("SFS2X.Requests.MMO")
@js.native
object MMO extends js.Object {
  
  @js.native
  class MMORoomSettings protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.MMO.MMORoomSettings {
    /**
      * Creates a new MMORoomSettings instance.
      * @param {string} name The name of the MMORoom to be created.
      */
    def this(name: String) = this()
  }
  
  @js.native
  class MapLimits protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.MMO.MapLimits {
    /**
      * Creates a new MapLimits instance.
      * @param {Entities.Data.Vec3D} lowerLimit
      * @param {Entities.Data.Vec3D} higherLimit
      */
    def this(lowerLimit: Vec3D, higherLimit: Vec3D) = this()
  }
  
  @js.native
  class SetUserPositionRequest protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.MMO.SetUserPositionRequest {
    /**
      * Creates a new SetUserPositionRequest instance.
      * @param {Entities.Data.Vec3D} pos        The user position.
      * @param {Entities.MMORoom}    [targetRoom=null] The MMORoom object corresponding to the Room where the position should be set; if null, the last Room joined by the user is used.
      */
    def this(pos: Vec3D) = this()
    def this(pos: Vec3D, targetRoom: MMORoom) = this()
  }
}
