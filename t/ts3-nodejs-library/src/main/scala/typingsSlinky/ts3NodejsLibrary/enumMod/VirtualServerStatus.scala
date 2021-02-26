package typingsSlinky.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualServerStatus extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "VirtualServerStatus")
@js.native
object VirtualServerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VirtualServerStatus with String] = js.native
  
  @js.native
  sealed trait BOOTING_UP extends VirtualServerStatus
  /* "booting up" */ val BOOTING_UP: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.BOOTING_UP with String = js.native
  
  @js.native
  sealed trait DEPLOY_RUNNING extends VirtualServerStatus
  /* "deploy running" */ val DEPLOY_RUNNING: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.DEPLOY_RUNNING with String = js.native
  
  @js.native
  sealed trait OFFLINE extends VirtualServerStatus
  /* "offline" */ val OFFLINE: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.OFFLINE with String = js.native
  
  @js.native
  sealed trait ONLINE extends VirtualServerStatus
  /* "online" */ val ONLINE: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.ONLINE with String = js.native
  
  @js.native
  sealed trait ONLINE_VIRTUAL extends VirtualServerStatus
  /* "online virtual" */ val ONLINE_VIRTUAL: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.ONLINE_VIRTUAL with String = js.native
  
  @js.native
  sealed trait OTHER_INSTANCE extends VirtualServerStatus
  /* "other instance" */ val OTHER_INSTANCE: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.OTHER_INSTANCE with String = js.native
  
  @js.native
  sealed trait SHUTTING_DOWN extends VirtualServerStatus
  /* "shutting down" */ val SHUTTING_DOWN: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.SHUTTING_DOWN with String = js.native
  
  @js.native
  sealed trait UNKNOWN extends VirtualServerStatus
  /* "unknown" */ val UNKNOWN: typingsSlinky.ts3NodejsLibrary.enumMod.VirtualServerStatus.UNKNOWN with String = js.native
}
