package typingsSlinky.uniApp.Page

import typingsSlinky.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInstance[D /* <: AnyObject */, T /* <: AnyObject */] extends PageInstanceBaseProps[D] {
  /**
    * 监听页面返回
    * @param options tab 点击参数
    * @return 返回 `true` 时阻止页面返回
    */
  var onBackPress: js.UndefOr[js.Function1[/* options */ BackPressOption, _]] = js.native
  /**
    * 生命周期回调 监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，应用切入后台等。
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 生命周期回调 监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    * @param query 打开当前页面路径中的参数
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[AnyObject], Unit]] = js.native
  /**
    * 监听原生标题栏按钮点击事件
    * @param options tab 点击参数
    */
  var onNavigationBarButtonTap: js.UndefOr[js.Function1[/* options */ NavigationBarButtonTapOption, Unit]] = js.native
  /**
    * 监听原生标题栏搜索输入框输入内容变化事件
    */
  var onNavigationBarSearchInputChanged: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
  /**
    * 监听原生标题栏搜索输入框点击事件
    */
  var onNavigationBarSearchInputClicked: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 监听原生标题栏搜索输入框搜索事件，用户点击软键盘上的“搜索”按钮时触发。
    */
  var onNavigationBarSearchInputConfirmed: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
  /**
    * 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    * @param options 页面滚动参数
    */
  var onPageScroll: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
  /**
    * 监听用户下拉动作
    * - 需要在 `pages.json` 的页面配置中开启 `enablePullDownRefresh` 。
    * - 可以通过 `uni.startPullDownRefresh` 触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`uni.stopPullDownRefresh` 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 页面上拉触底事件的处理函数
    * - 可以在 `pages.json` 的页面配置中设置触发距离 `onReachBottomDistance` 。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 生命周期回调 监听页面初次渲染完成
    *
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 页面尺寸改变时触发
    * @param options 页面滚动参数
    */
  var onResize: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
  /**
    * 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    * @param options 分享发起来源参数
    * @return 转发内容
    */
  var onShareAppMessage: js.UndefOr[js.Function1[/* options */ ShareAppMessageOption, CustomShareContent]] = js.native
  /**
    * 生命周期回调 监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 当前是 tab 页时，点击 tab 时触发
    * @param options tab 点击参数
    */
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ TabItemTapOption, Unit]] = js.native
  /**
    * 生命周期回调 监听页面卸载
    *
    * 页面卸载时触发。如 `redirectTo` 或 `navigateBack` 到其他页面时。
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
}

object PageInstance {
  @scala.inline
  def apply[D, T](): PageInstance[D, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstance[D, T]]
  }
  @scala.inline
  implicit class PageInstanceOps[Self[d, t] <: PageInstance[d, t], D, T] (val x: Self[D, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T]) with Other]
    @scala.inline
    def withOnBackPress(value: /* options */ BackPressOption => _): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBackPress: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* query */ js.UndefOr[AnyObject] => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigationBarButtonTap(value: /* options */ NavigationBarButtonTapOption => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarButtonTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNavigationBarButtonTap: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarButtonTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigationBarSearchInputChanged(value: /* event */ NavigationBarSearchInputEvent => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNavigationBarSearchInputChanged: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigationBarSearchInputClicked(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputClicked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNavigationBarSearchInputClicked: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigationBarSearchInputConfirmed(value: /* event */ NavigationBarSearchInputEvent => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputConfirmed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNavigationBarSearchInputConfirmed: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationBarSearchInputConfirmed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScroll(value: /* options */ PageScrollOption => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScroll: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottom(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReachBottom: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* options */ PageScrollOption => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShareAppMessage(value: /* options */ ShareAppMessageOption => CustomShareContent): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShareAppMessage: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabItemTap(value: /* options */ TabItemTapOption => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabItemTap: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnload(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnload: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.undefined)
        ret
    }
  }
  
}

