package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Component {
  
  type AllFullProperty = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.FullProperty[
    typingsSlinky.std.ArrayConstructor | typingsSlinky.std.BooleanConstructor | scala.Null | typingsSlinky.std.NumberConstructor | typingsSlinky.std.ObjectConstructor | typingsSlinky.std.StringConstructor
  ]
  
  type AllProperty = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.AllFullProperty | typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.ShortProperty
  
  type Constructor = js.Function1[
    /* options */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Options[
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DataOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.MethodOption, 
      js.Object, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramBooleans.`false`
    ], 
    java.lang.String
  ]
  
  type DataOption = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type DefinitionFilter = js.Function2[
    /* defFields */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.TrivialOption, 
    /* definitionFilterArr */ js.UndefOr[
      js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
      ]
    ], 
    scala.Unit
  ]
  
  type FullPropertyToData[T /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.AllFullProperty */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.ValueType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
  ]
  
  type Instance[TData /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.DataOption */, TProperty /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption */, TMethod /* <: typingsSlinky.std.Partial[typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.MethodOption] */, TCustomInstanceProperty /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TIsPage /* <: scala.Boolean */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.InstanceProperties with typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.InstanceMethods[TData] with TMethod with (js.Object | typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.ILifetime) with TCustomInstanceProperty with (typingsSlinky.wechatMiniprogram.anon.Data[TData, TProperty])
  
  type MethodOption = typingsSlinky.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  
  type PropertyOption = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.AllProperty
  ]
  
  type PropertyOptionToData[P /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in keyof P ]: wechat-miniprogram.WechatMiniprogram.Component.PropertyToData<P[name]>}
    */ typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.PropertyOptionToData with org.scalablytyped.runtime.TopLevel[P]
  
  type PropertyToData[T /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.AllProperty */] = (typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.FullPropertyToData[
    typingsSlinky.std.Exclude[T, typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.ShortProperty]
  ]) | typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.ValueType[T]
  
  type PropertyType = typingsSlinky.std.StringConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.ArrayConstructor | typingsSlinky.std.ObjectConstructor | scala.Null
  
  type ShortProperty = typingsSlinky.std.StringConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.ArrayConstructor | typingsSlinky.std.ObjectConstructor | scala.Null
  
  type TrivialInstance = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.Instance[
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.wechatMiniprogramBooleans.`false`
  ]
  
  type ValueType[T /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.PropertyType */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject | js.Array[js.Any] | scala.Boolean | scala.Double | java.lang.String
}
