package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDownloadSourceType extends StObject
@JSImport("steam-client", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType with Double] = js.native
  
  @js.native
  sealed trait CDN extends EContentDownloadSourceType
  /* 2 */ val CDN: typingsSlinky.steamClient.mod.EContentDownloadSourceType.CDN with Double = js.native
  
  @js.native
  sealed trait CS extends EContentDownloadSourceType
  /* 1 */ val CS: typingsSlinky.steamClient.mod.EContentDownloadSourceType.CS with Double = js.native
  
  @js.native
  sealed trait Invalid extends EContentDownloadSourceType
  /* 0 */ val Invalid: typingsSlinky.steamClient.mod.EContentDownloadSourceType.Invalid with Double = js.native
  
  @js.native
  sealed trait LANPeer extends EContentDownloadSourceType
  /* 5 */ val LANPeer: typingsSlinky.steamClient.mod.EContentDownloadSourceType.LANPeer with Double = js.native
  
  @js.native
  sealed trait LCS extends EContentDownloadSourceType
  /* 3 */ val LCS: typingsSlinky.steamClient.mod.EContentDownloadSourceType.LCS with Double = js.native
  
  @js.native
  sealed trait Max extends EContentDownloadSourceType
  /* 5 */ val Max: typingsSlinky.steamClient.mod.EContentDownloadSourceType.Max with Double = js.native
  
  @js.native
  sealed trait ProxyCache extends EContentDownloadSourceType
  /* 4 */ val ProxyCache: typingsSlinky.steamClient.mod.EContentDownloadSourceType.ProxyCache with Double = js.native
}
