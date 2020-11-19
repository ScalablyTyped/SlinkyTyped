package typingsSlinky.winrtUwp.global.Windows.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
@JSGlobal("Windows.Services.Maps")
@js.native
object Maps extends js.Object {
  
  /** Provides APIs for turn-by-turn guided navigation. */
  @js.native
  object Guidance extends js.Object {
    
    /** Specifies the path of the lane. */
    @js.native
    object GuidanceLaneMarkers extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers with Double
          ] = js.native
      
      /* 6 */ val hardLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft with Double = js.native
      
      /* 3 */ val hardRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight with Double = js.native
      
      /* 7 */ val left: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left with Double = js.native
      
      /* 8 */ val lightLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft with Double = js.native
      
      /* 1 */ val lightRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight with Double = js.native
      
      /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none with Double = js.native
      
      /* 2 */ val right: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right with Double = js.native
      
      /* 4 */ val straight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight with Double = js.native
      
      /* 10 */ val unknown: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown with Double = js.native
      
      /* 5 */ val uturnLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft with Double = js.native
      
      /* 9 */ val uturnRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight with Double = js.native
    }
  }
}
