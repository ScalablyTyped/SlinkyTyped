package typingsSlinky.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkIpMode extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkIpMode")
@js.native
object NetworkIpMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkIpMode with Double] = js.native
  
  /**
    *  DHCP: Connected to wired or wireless IPv4 network through automatic IP configuration
    */
  @js.native
  sealed trait AUTO extends NetworkIpMode
  /* 3 */ val AUTO: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.AUTO with Double = js.native
  
  /**
    * Connected to wired or wireless IPv6 network through dynamic IP configuration
    */
  @js.native
  sealed trait DYNAMIC extends NetworkIpMode
  /* 2 */ val DYNAMIC: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.DYNAMIC with Double = js.native
  
  /**
    * Connected to cellular network through fixed IP configuration
    */
  @js.native
  sealed trait FIXED extends NetworkIpMode
  /* 4 */ val FIXED: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.FIXED with Double = js.native
  
  /**
    * No network IP mode configured
    */
  @js.native
  sealed trait NONE extends NetworkIpMode
  /* 0 */ val NONE: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.NONE with Double = js.native
  
  /**
    * Connected to wired or wireless IPv4 network through static IP configuration
    */
  @js.native
  sealed trait STATIC extends NetworkIpMode
  /* 1 */ val STATIC: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.STATIC with Double = js.native
  
  /**
    * No wired or wireless connection
    */
  @js.native
  sealed trait UNKNOWN extends NetworkIpMode
  /* 5 */ val UNKNOWN: typingsSlinky.tizenTvWebapis.networkMod.NetworkIpMode.UNKNOWN with Double = js.native
}
