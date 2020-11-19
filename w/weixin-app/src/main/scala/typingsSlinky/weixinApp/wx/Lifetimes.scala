package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
  * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
  */
@js.native
trait Lifetimes extends js.Object {
  
  /**
    * 组件生命周期函数，在组件实例进入页面节点树时执行
    */
  def attached(): Unit = js.native
  
  /**
    * 组件生命周期函数，在组件实例进入页面节点树时执行
    * 注意此时不能调用 setData
    */
  def created(): Unit = js.native
  
  /**
    * 组件生命周期函数，在组件实例被从页面节点树移除时执行
    */
  def detached(): Unit = js.native
  
  /**
    * 组件生命周期函数，在组件实例被移动到节点树另一个位置时执行
    */
  def moved(): Unit = js.native
  
  /**
    * 组件生命周期函数，在组件布局完成后执行，此时可以获取节点信息
    * 使用 [SelectorQuery](https://mp.weixin.qq.com/debug/wxadoc/dev/api/wxml-nodes-info.html)
    */
  def ready(): Unit = js.native
}
object Lifetimes {
  
  @scala.inline
  def apply(
    attached: () => Unit,
    created: () => Unit,
    detached: () => Unit,
    moved: () => Unit,
    ready: () => Unit
  ): Lifetimes = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[Lifetimes]
  }
  
  @scala.inline
  implicit class LifetimesOps[Self <: Lifetimes] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
  }
}
