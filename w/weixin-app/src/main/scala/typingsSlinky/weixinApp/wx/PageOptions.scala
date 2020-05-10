package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.AnonScrollTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Page 实现的接口对象
	 */
@js.native
trait PageOptions extends js.Object {
  /**
  		 * 页面的初始数据
  		 */
  var data: js.UndefOr[js.Any] = js.native
  /**
  		 * 生命周期函数--监听页面隐藏
  		 */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 生命周期函数--监听页面加载
  		 * @param options 接收页面参数可以获取wx.navigateTo和wx.redirectTo及<navigator/>中的 query
  		 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Object, Unit]] = js.native
  /**
  		 * 页面滚动触发事件的处理函数
  		 * 监听用户滑动页面事件。
  		 * 参数为 Object，包含以下字段：
  		 */
  var onPageScroll: js.UndefOr[js.Function1[/* option */ AnonScrollTop, Unit]] = js.native
  /**
  		 * 下拉刷新
  		 * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
  		 * 需要在 config 的window选项中开启 enablePullDownRefresh。
  		 * 当处理完数据刷新后，wx.stopPullDownRefresh可以停止当前页面的下拉刷新。
  		 */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 页面上拉触底事件的处理函数
  		 * 监听用户上拉触底事件。
  		 * 可以在app.json的window选项中或页面配置中设置触发距离onReachBottomDistance。
  		 * 在触发距离内滑动期间，本事件只会被触发一次。
  		 */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 生命周期函数--监听页面初次渲染完成
  		 */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 在 Page 中定义 onShareAppMessage 函数，设置该页面的转发信息。
  		 * + 只有定义了此事件处理函数，右上角菜单才会显示 “转发” 按
  		 * + 用户点击转发按钮的时候会调
  		 * + 此事件需要 return 一个 Object，用于自定义转发内容
  		 */
  var onShareAppMessage: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[PageShareAppMessageOptions], ShareAppMessage]
  ] = js.native
  /**
  		 * 生命周期函数--监听页面显示
  		 */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 当前是 tab 页时，点击 tab 时触发
  		 */
  var onTabItemTap: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  /**
  		 * 生命周期函数--监听页面卸载
  		 */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
}

object PageOptions {
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  @scala.inline
  implicit class PageOptionsOps[Self <: PageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* options */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScroll(value: /* option */ AnonScrollTop => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReachBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShareAppMessage(value: /* options */ js.UndefOr[PageShareAppMessageOptions] => ShareAppMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShareAppMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabItemTap(value: /* item */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabItemTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.undefined)
        ret
    }
  }
  
}

