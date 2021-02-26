package typingsSlinky.socks.constantsMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocksUDPFrameDetails extends StObject {
  
  var data: Buffer = js.native
  
  var frameNumber: js.UndefOr[Double] = js.native
  
  var remoteHost: SocksRemoteHost = js.native
}
object SocksUDPFrameDetails {
  
  @scala.inline
  def apply(data: Buffer, remoteHost: SocksRemoteHost): SocksUDPFrameDetails = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksUDPFrameDetails]
  }
  
  @scala.inline
  implicit class SocksUDPFrameDetailsMutableBuilder[Self <: SocksUDPFrameDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameNumber(value: Double): Self = StObject.set(x, "frameNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameNumberUndefined: Self = StObject.set(x, "frameNumber", js.undefined)
    
    @scala.inline
    def setRemoteHost(value: SocksRemoteHost): Self = StObject.set(x, "remoteHost", value.asInstanceOf[js.Any])
  }
}
