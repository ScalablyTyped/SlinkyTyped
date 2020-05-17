package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.weixinApp.anon.PartialLifetimes
import typingsSlinky.weixinApp.anon.PartialPageLifetimes
import typingsSlinky.weixinApp.anon.PartialaddGlobalClassbool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Component组件参数
	 */
/* Inlined parent std.Partial<weixin-app.wx.Lifetimes> */
@js.native
trait ComponentOptions[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 类似于mixins和traits的组件间代码复用机制
  		 * 参见 [behaviors](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/behaviors.html)
  		 */
  var behaviors: js.UndefOr[Behaviors] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 组件的内部数据，和 properties 一同用于组件的模版渲染
  		 */
  var data: js.UndefOr[Data] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 组件接受的外部样式类，参见 外部样式类
  		 *
  		 * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
  		 * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
  		 *
  		 * @version 1.9.90
  		 */
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
  		 * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
  		 */
  var lifetimes: js.UndefOr[PartialLifetimes] = js.native
  /**
  		 * 组件的方法，包括事件响应函数和任意的自定义方法
  		 * 关于事件响应函数的使用
  		 * 参见[组件事件](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/events.html)
  		 */
  var methods: js.UndefOr[Methods] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 数据监听器可以用于监听和响应任何属性和数据字段的变化。从小程序基础库版本 2.6.1 开始支持
  		 * @since 2.6.1
  		 */
  var observers: js.UndefOr[ObserversDefs[Instance]] = js.native
  /**
  		 * 一些组件选项，请参见文档其他部分的说明
  		 */
  var options: js.UndefOr[PartialaddGlobalClassbool] = js.native
  /**
  		 * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
  		 */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  /**
  		 * 组件的对外属性，是属性名到属性设置的映射表
  		 * 属性设置中可包含三个字段:
  		 * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
  		 */
  var properties: js.UndefOr[Props] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 组件间关系定义，参见 [组件间关系](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/relations.html)
  		 */
  var relations: js.UndefOr[StringDictionary[ComponentRelation[_, _]]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[Instance, Data, Methods, Props, Behaviors](): ComponentOptions[Instance, Data, Methods, Props, Behaviors] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props, Behaviors]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self[instance, data, methods, props, behaviors] <: ComponentOptions[instance, data, methods, props, behaviors], Instance, Data, Methods, Props, Behaviors] (val x: Self[Instance, Data, Methods, Props, Behaviors]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Instance, Data, Methods, Props, Behaviors] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Instance, Data, Methods, Props, Behaviors]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Instance, Data, Methods, Props, Behaviors]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Instance, Data, Methods, Props, Behaviors]) with Other]
    @scala.inline
    def withAttached(value: () => Unit): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAttached: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviors(value: Behaviors): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: () => Unit): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: () => Unit): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetached: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalClasses(value: js.Array[String]): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalClasses: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetimes(value: PartialLifetimes): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetimes: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimes")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: Methods): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withMoved(value: () => Unit): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoved: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.undefined)
        ret
    }
    @scala.inline
    def withObservers(value: ObserversDefs[Instance]): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservers: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: PartialaddGlobalClassbool): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLifetimes(value: PartialPageLifetimes): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLifetimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLifetimes: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLifetimes")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Props): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withRelations(value: StringDictionary[ComponentRelation[_, _]]): Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelations: Self[Instance, Data, Methods, Props, Behaviors] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(js.undefined)
        ret
    }
  }
  
}

