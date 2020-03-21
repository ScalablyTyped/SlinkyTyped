package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  type AccelerometerChangeCallback = js.Function1[/* res */ typingsSlinky.weixinApp.wx.AccelerometerData, scala.Unit]
  type AccelerometerOptions = typingsSlinky.weixinApp.wx.BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
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
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (typingsSlinky.std.Record[java.lang.String, js.Any])
  type FormEvent = typingsSlinky.weixinApp.wx.BuiltInEvent[typingsSlinky.weixinApp.weixinAppStrings.form, typingsSlinky.weixinApp.AnonValue]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = typingsSlinky.weixinApp.wx.BuiltInEvent[typingsSlinky.weixinApp.weixinAppStrings.input, typingsSlinky.weixinApp.AnonCursor]
  /**
  	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  	 */
  type ObserversDefs[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type Prop[T] = js.Function0[T] | typingsSlinky.weixinApp.AnonInstantiable[T]
  type PropValidator[T] = typingsSlinky.weixinApp.wx.PropOptions[T] | typingsSlinky.weixinApp.wx.Prop[T] | js.Array[typingsSlinky.weixinApp.wx.Prop[T]]
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
  type PropsDefinition[T] = typingsSlinky.weixinApp.wx.ArrayPropsDefinition[T] | typingsSlinky.weixinApp.wx.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ typingsSlinky.weixinApp.weixinAppStrings.RecordPropsDefinition with T
  type RemoveSavedFileOptions = typingsSlinky.weixinApp.wx.GetSavedFileInfoOptions
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RmdirOptions = typingsSlinky.weixinApp.wx.MkdirOptions
  // #endregion
  // #region App里的onLaunch、onShow回调参数
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.weixinApp.weixinAppNumbers.`1001`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1005`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1006`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1007`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1008`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1011`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1012`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1013`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1014`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1017`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1019`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1020`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1022`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1023`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1024`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1025`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1026`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1027`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1028`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1029`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1030`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1031`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1032`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1034`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1035`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1036`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1037`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1038`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1039`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1042`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1043`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1044`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1045`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1046`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1047`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1048`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1049`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1052`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1053`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1054`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1056`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1057`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1058`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1059`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1064`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1067`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1068`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1069`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1071`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1072`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1073`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1074`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1077`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1078`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1079`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1081`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1082`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1084`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1089`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1090`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1091`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1092`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1095`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1096`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1097`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1099`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1102`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1103`
    - typingsSlinky.weixinApp.weixinAppNumbers.`1104`
    - scala.Double
  */
  type SceneValues = typingsSlinky.weixinApp.wx._SceneValues | scala.Double
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
  type UnboxBehaviorData[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)
  type UnboxBehaviorMethods[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)
  type UnboxBehaviorProps[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)
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
