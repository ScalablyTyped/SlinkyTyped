package typingsSlinky.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  /**
    * If true, fragmented messages will be automatically assembled and the full
    * message will be emitted via a `message` event. If false, each frame will be
    * emitted on the `connection` object via a `frame` event and the application
    * will be responsible for aggregating multiple fragmented frames. Single-frame
    * messages will emit a `message` event in addition to the `frame` event.
    * @default true
    */
  var assembleFragments: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to wait after sending a close frame for an
    * `acknowledgement` to come back before giving up and just closing the socket.
    * @default 5000
    */
  var closeTimeout: js.UndefOr[Double] = js.native
  /**
    * Whether or not to fragment outgoing messages. If true, messages will be
    * automatically fragmented into chunks of up to `fragmentationThreshold` bytes.
    * @default true
    */
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of a frame in bytes before it is automatically fragmented.
    * @default 16KiB
    */
  var fragmentationThreshold: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed received frame size in bytes.
    * Single frame messages will also be limited to this maximum.
    */
  var maxReceivedFrameSize: js.UndefOr[Double] = js.native
  /** The maximum allowed aggregate message size (for fragmented messages) in bytes */
  var maxReceivedMessageSize: js.UndefOr[Double] = js.native
}

object IConfig {
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssembleFragments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assembleFragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssembleFragments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assembleFragments")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentOutgoingMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOutgoingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentOutgoingMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOutgoingMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReceivedFrameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedFrameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReceivedFrameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedFrameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReceivedMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReceivedMessageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedMessageSize")(js.undefined)
        ret
    }
  }
  
}

