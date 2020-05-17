package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  type AccelerometerChangeCallback = js.Function1[/* res */ typingsSlinky.weixinApp.wx.AccelerometerData, scala.Unit]
  type AccelerometerOptions = typingsSlinky.weixinApp.wx.BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  type ArrayType[T /* <: js.Array[_] */] = js.Any
  type BuiltInEvent[T /* <: typingsSlinky.weixinApp.wx.EventType */, Detail] = typingsSlinky.weixinApp.wx.BaseEvent[T, Detail]
  type CheckSessionOption = typingsSlinky.weixinApp.wx.BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typingsSlinky.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = Methods with Instance with typingsSlinky.weixinApp.wx.UnboxBehaviorsMethods[Behaviors]
  type CompassChangeCallback = js.Function1[/* res */ typingsSlinky.weixinApp.wx.CompassData, scala.Unit]
  type CompassOptions = typingsSlinky.weixinApp.wx.BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = typingsSlinky.weixinApp.wx.BaseEvent[T, Detail]
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type FormEvent = typingsSlinky.weixinApp.wx.BuiltInEvent[typingsSlinky.weixinApp.weixinAppStrings.form, typingsSlinky.weixinApp.anon.Value]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = typingsSlinky.weixinApp.wx.BuiltInEvent[
    typingsSlinky.weixinApp.weixinAppStrings.input, 
    typingsSlinky.weixinApp.anon.Cursor
  ]
  /**
  	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  	 */
  type ObserversDefs[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  /**
  	 * There are two valid ways to define the type of data / properties:
  	 *
  	 * 1. { name: valueType }
  	 * 2. { name: { type: valueType, value?: value } }
  	 *
  	 * and this conditional type will extract that out so the call-site will typecheck.
  	 *
  	 * Note this is different from PropOptions as it is the definitions you passed to Component function
  	 * whereas this type is for call-site.
  	 */
  type PropValueType[Def] = js.Any
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ typingsSlinky.weixinApp.weixinAppStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  type RemoveSavedFileOptions = typingsSlinky.weixinApp.wx.GetSavedFileInfoOptions
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RmdirOptions = typingsSlinky.weixinApp.wx.MkdirOptions
  type ScrollEvent = typingsSlinky.weixinApp.wx.BuiltInEvent[typingsSlinky.weixinApp.weixinAppStrings.scroll, js.Object]
  type TapEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsSlinky.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = js.Object with (typingsSlinky.weixinApp.wx.ComponentOptions[V, Data, Methods, Props, Behaviors]) with (typingsSlinky.std.ThisType[typingsSlinky.weixinApp.wx.CombinedInstance[V, Data, Methods, Props, Behaviors]])
  type TouchCancelEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.touchcancel]
  type TouchEndEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.touchend]
  type TouchForceChangeEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.touchforcechange]
  type TouchMoveEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.touchmove]
  type TouchStartEvent = typingsSlinky.weixinApp.wx.TouchEvent[typingsSlinky.weixinApp.weixinAppStrings.touchstart]
  type UnboxBehaviorsData[Behaviors /* <: js.Array[
    (typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsSlinky.weixinApp.wx.UnboxBehaviorData[
    typingsSlinky.weixinApp.wx.UnionToIntersection[typingsSlinky.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnboxBehaviorsMethods[Behaviors /* <: js.Array[
    (typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsSlinky.weixinApp.wx.UnboxBehaviorMethods[
    typingsSlinky.weixinApp.wx.UnionToIntersection[typingsSlinky.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnboxBehaviorsProps[Behaviors /* <: js.Array[
    (typingsSlinky.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typingsSlinky.weixinApp.wx.UnboxBehaviorProps[
    typingsSlinky.weixinApp.wx.UnionToIntersection[typingsSlinky.weixinApp.wx.ArrayType[Behaviors]]
  ]
  type UnionToIntersection[U] = js.Any
  type WriteFileOptions = typingsSlinky.weixinApp.wx.AppendFileOptions
}
