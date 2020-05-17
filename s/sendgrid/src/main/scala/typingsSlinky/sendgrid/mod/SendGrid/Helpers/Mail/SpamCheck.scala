package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.Posttourl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpamCheck extends js.Object {
  def getEnable(): Boolean = js.native
  def getPosttoUrl(): String = js.native
  def getThreshold(): Double = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setPosttoUrl(post_to_url: String): Unit = js.native
  def setThreshold(threshold: Double): Unit = js.native
  def toJSON(): Posttourl = js.native
}

object SpamCheck {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getPosttoUrl: () => String,
    getThreshold: () => Double,
    setEnable: Boolean => Unit,
    setPosttoUrl: String => Unit,
    setThreshold: Double => Unit,
    toJSON: () => Posttourl
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getPosttoUrl = js.Any.fromFunction0(getPosttoUrl), getThreshold = js.Any.fromFunction0(getThreshold), setEnable = js.Any.fromFunction1(setEnable), setPosttoUrl = js.Any.fromFunction1(setPosttoUrl), setThreshold = js.Any.fromFunction1(setThreshold), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SpamCheck]
  }
  @scala.inline
  implicit class SpamCheckOps[Self <: SpamCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosttoUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosttoUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThreshold(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreshold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosttoUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosttoUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetThreshold(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => Posttourl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

