package typingsSlinky.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkActiveConnectionType extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkActiveConnectionType")
@js.native
object NetworkActiveConnectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkActiveConnectionType with Double] = js.native
  
  /**
    * Connected to a cellular network.
    */
  @js.native
  sealed trait CELLULAR extends NetworkActiveConnectionType
  /* 2 */ val CELLULAR: typingsSlinky.tizenTvWebapis.networkMod.NetworkActiveConnectionType.CELLULAR with Double = js.native
  
  /**
    * No network configured
    */
  @js.native
  sealed trait DISCONNECTED extends NetworkActiveConnectionType
  /* 0 */ val DISCONNECTED: typingsSlinky.tizenTvWebapis.networkMod.NetworkActiveConnectionType.DISCONNECTED with Double = js.native
  
  /**
    * Connected to an Ethernet network.
    */
  @js.native
  sealed trait ETHERNET extends NetworkActiveConnectionType
  /* 3 */ val ETHERNET: typingsSlinky.tizenTvWebapis.networkMod.NetworkActiveConnectionType.ETHERNET with Double = js.native
  
  /**
    * Connected to a Wi-Fi network.
    */
  @js.native
  sealed trait WIFI extends NetworkActiveConnectionType
  /* 1 */ val WIFI: typingsSlinky.tizenTvWebapis.networkMod.NetworkActiveConnectionType.WIFI with Double = js.native
}
