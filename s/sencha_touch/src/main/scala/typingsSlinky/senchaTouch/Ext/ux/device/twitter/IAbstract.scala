package typingsSlinky.senchaTouch.Ext.ux.device.twitter

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Pops up a Twitter compose sheet view with your specified tweet
  		* @param config Object An object which contains the following config options:
  		*/
  var compose: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets Tweets from Twitter Mentions
  		* @param config Object An object which contains the following config options:
  		*/
  var getMentions: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets Tweets from Twitter Timeline
  		* @param config Object An object which contains the following config options:
  		*/
  var getPublicTimeline: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets a specific Twitter user info
  		* @param config Object An object which contains the following config options:
  		*/
  var getTwitterRequest: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets a specific Twitter user info
  		* @param config Object An object which contains the following config options:
  		*/
  var getTwitterUsername: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompose(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMentions(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMentions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMentions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPublicTimeline(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicTimeline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPublicTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicTimeline")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTwitterRequest(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTwitterRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTwitterRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTwitterRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTwitterUsername(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTwitterUsername")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTwitterUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTwitterUsername")(js.undefined)
        ret
    }
  }
  
}

