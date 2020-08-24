package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Behavior {
  type Constructor = js.Function1[
    /* options */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.Options[
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption
    ], 
    java.lang.String
  ]
  type Data[D /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Data[D]
  type DataOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DataOption
  type DefinitionFilter = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter
  type Instance[TData /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */, TProperty /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */, TMethod /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Instance[TData, TProperty, TMethod, js.Object]
  type Lifetimes = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Lifetimes
  type Method[M /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Method[M]
  type MethodOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.MethodOption
  type Property[P /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Property[P]
  type PropertyOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
  type TrivialInstance = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.Instance[
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
}
