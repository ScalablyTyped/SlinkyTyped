package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import typingsSlinky.winrtUwp.anon.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parses data from a PlayReady-ND media stream. */
@js.native
trait INDStreamParser extends js.Object {
  
  /** Notifies a PlayReady-ND stream parser to be ready for the beginning of a new media stream. */
  def beginOfStream(): Unit = js.native
  
  /** Notifies a PlayReady-ND stream parser that the end of a media stream has been reached. */
  def endOfStream(): Unit = js.native
  
  /**
    * Retrieves the stream type (audio or video) and stream identifier of the media stream descriptor.
    * @param descriptor The media stream from which this method gets information.
    */
  def getStreamInformation(descriptor: IMediaStreamDescriptor): StreamType = js.native
  
  /** Gets the stream parser notifier that will provide notification of stream parser events from the transmitter. */
  var notifier: NDStreamParserNotifier = js.native
  
  /**
    * Parses samples from a PlayReady-ND media stream.
    * @param dataBytes The data to be parsed.
    */
  def parseData(dataBytes: js.Array[Double]): Unit = js.native
}
object INDStreamParser {
  
  @scala.inline
  def apply(
    beginOfStream: () => Unit,
    endOfStream: () => Unit,
    getStreamInformation: IMediaStreamDescriptor => StreamType,
    notifier: NDStreamParserNotifier,
    parseData: js.Array[Double] => Unit
  ): INDStreamParser = {
    val __obj = js.Dynamic.literal(beginOfStream = js.Any.fromFunction0(beginOfStream), endOfStream = js.Any.fromFunction0(endOfStream), getStreamInformation = js.Any.fromFunction1(getStreamInformation), notifier = notifier.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData))
    __obj.asInstanceOf[INDStreamParser]
  }
  
  @scala.inline
  implicit class INDStreamParserOps[Self <: INDStreamParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginOfStream(value: () => Unit): Self = this.set("beginOfStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndOfStream(value: () => Unit): Self = this.set("endOfStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStreamInformation(value: IMediaStreamDescriptor => StreamType): Self = this.set("getStreamInformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifier(value: NDStreamParserNotifier): Self = this.set("notifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseData(value: js.Array[Double] => Unit): Self = this.set("parseData", js.Any.fromFunction1(value))
  }
}
