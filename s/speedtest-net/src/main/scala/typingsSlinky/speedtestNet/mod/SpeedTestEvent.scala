package typingsSlinky.speedtestNet.mod

import typingsSlinky.speedtestNet.anon.Id
import typingsSlinky.speedtestNet.speedtestNetStrings.config
import typingsSlinky.speedtestNet.speedtestNetStrings.download
import typingsSlinky.speedtestNet.speedtestNetStrings.log
import typingsSlinky.speedtestNet.speedtestNetStrings.ping
import typingsSlinky.speedtestNet.speedtestNetStrings.result
import typingsSlinky.speedtestNet.speedtestNetStrings.testStart
import typingsSlinky.speedtestNet.speedtestNetStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.speedtestNet.mod.ConfigEvent
  - typingsSlinky.speedtestNet.mod.DownloadEvent
  - typingsSlinky.speedtestNet.mod.LogEvent
  - typingsSlinky.speedtestNet.mod.PingEvent
  - typingsSlinky.speedtestNet.mod.ResultEvent
  - typingsSlinky.speedtestNet.mod.TestStartEvent
  - typingsSlinky.speedtestNet.mod.UploadEvent
*/
trait SpeedTestEvent extends js.Object
object SpeedTestEvent {
  
  @scala.inline
  def DownloadEvent(download: DownloadUploadData, progress: Double, timestamp: js.Date, `type`: download): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def TestStartEvent(
    interface: InterfaceData,
    isp: String,
    progress: Double,
    server: ServerData,
    timestamp: js.Date,
    `type`: testStart
  ): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def LogEvent(level: String, message: String, progress: Double, timestamp: js.Date, `type`: log): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def PingEvent(ping: PingData, progress: Double, timestamp: js.Date, `type`: ping): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(ping = ping.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def UploadEvent(progress: Double, timestamp: js.Date, `type`: upload, upload: DownloadUploadData): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def ConfigEvent(app: AppData, progress: Double, servers: js.Array[ServerData], suite: SuiteData, `type`: config): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], servers = servers.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
  
  @scala.inline
  def ResultEvent(
    download: DownloadUploadData,
    interface: InterfaceData,
    isp: String,
    packetLoss: Double,
    ping: PingData,
    result: Id,
    server: ServerData,
    timestamp: js.Date,
    `type`: result,
    upload: DownloadUploadData
  ): SpeedTestEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], packetLoss = packetLoss.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTestEvent]
  }
}
