package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Behavior {
  
  type BehaviorIdentifier = java.lang.String
  
  type Constructor = js.Function1[
    /* options */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.Options[
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption, 
      typingsSlinky.std.Record[java.lang.String, scala.Nothing]
    ], 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
  ]
  
  type Data[D /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Data[D]
  
  type DataOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DataOption
  
  type DefinitionFilter = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter
  
  type Instance[TData /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */, TProperty /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */, TMethod /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */, TCustomInstanceProperty /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Instance[
    TData, 
    TProperty, 
    TMethod, 
    TCustomInstanceProperty, 
    typingsSlinky.wechatMiniprogram.wechatMiniprogramBooleans.`false`
  ]
  
  type Lifetimes = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Lifetimes
  
  type Method[M /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Method[M, typingsSlinky.wechatMiniprogram.wechatMiniprogramBooleans.`false`]
  
  type MethodOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.MethodOption
  
  type Property[P /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Property[P]
  
  type PropertyOption = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
  
  type TrivialInstance = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Behavior.Instance[
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.std.Record[java.lang.String, scala.Nothing]
  ]
}
