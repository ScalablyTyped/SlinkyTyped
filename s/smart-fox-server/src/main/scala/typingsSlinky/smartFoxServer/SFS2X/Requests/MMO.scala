package typingsSlinky.smartFoxServer.SFS2X.Requests

import typingsSlinky.smartFoxServer.SFS2X.Entities.Data.Vec3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region MMO
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.MMO.html
object MMO {
  
  @js.native
  trait MMORoomSettings extends StObject {
    
    /** @type {Entities.Data.Vec3D} Defines the Area of Interest (AoI) for the MMORoom. */
    var defaultAOI: Vec3D = js.native
    
    /** @type {MapLimits} Defines the limits of the virtual environment represented by the MMORoom. */
    var mapLimits: MapLimits = js.native
    
    /** @type {number} Configures the speed at which the SFSEvent.PROXIMITY_LIST_UPDATE event is sent by the server. */
    var proximityListUpdateMillis: Double = js.native
    
    /** @type {boolean} Sets if the users entry points in the current user's Area of Interest should be transmitted in the SFSEvent.PROXIMITY_LIST_UPDATE event. */
    var sendAOIEntryPoint: Boolean = js.native
    
    /** @type {number} Defines the time limit before a user without a physical position set inside the MMORoom is kicked from the Room. */
    var userMaxLimboSeconds: Double = js.native
  }
  object MMORoomSettings {
    
    @scala.inline
    def apply(
      defaultAOI: Vec3D,
      mapLimits: MapLimits,
      proximityListUpdateMillis: Double,
      sendAOIEntryPoint: Boolean,
      userMaxLimboSeconds: Double
    ): MMORoomSettings = {
      val __obj = js.Dynamic.literal(defaultAOI = defaultAOI.asInstanceOf[js.Any], mapLimits = mapLimits.asInstanceOf[js.Any], proximityListUpdateMillis = proximityListUpdateMillis.asInstanceOf[js.Any], sendAOIEntryPoint = sendAOIEntryPoint.asInstanceOf[js.Any], userMaxLimboSeconds = userMaxLimboSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMORoomSettings]
    }
    
    @scala.inline
    implicit class MMORoomSettingsMutableBuilder[Self <: MMORoomSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultAOI(value: Vec3D): Self = StObject.set(x, "defaultAOI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapLimits(value: MapLimits): Self = StObject.set(x, "mapLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProximityListUpdateMillis(value: Double): Self = StObject.set(x, "proximityListUpdateMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendAOIEntryPoint(value: Boolean): Self = StObject.set(x, "sendAOIEntryPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMaxLimboSeconds(value: Double): Self = StObject.set(x, "userMaxLimboSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapLimits extends StObject {
    
    /** @type {Entities.Data.Vec3D} Returns the higher coordinates limit of the virtual environment along the X,Y,Z axes. */
    var higherLimit: Vec3D = js.native
    
    /** @type {Entities.Data.Vec3D} Returns the lower coordinates limit of the virtual environment along the X,Y,Z axes. */
    var lowerLimit: Vec3D = js.native
  }
  object MapLimits {
    
    @scala.inline
    def apply(higherLimit: Vec3D, lowerLimit: Vec3D): MapLimits = {
      val __obj = js.Dynamic.literal(higherLimit = higherLimit.asInstanceOf[js.Any], lowerLimit = lowerLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapLimits]
    }
    
    @scala.inline
    implicit class MapLimitsMutableBuilder[Self <: MapLimits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHigherLimit(value: Vec3D): Self = StObject.set(x, "higherLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerLimit(value: Vec3D): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetUserPositionRequest extends StObject
}
