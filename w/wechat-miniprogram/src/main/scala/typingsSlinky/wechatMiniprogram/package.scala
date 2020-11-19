package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wechatMiniprogram {
  
  type AnyArray = js.Array[js.Any]
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type IAPIFunction[T, P /* <: typingsSlinky.wechatMiniprogram.IAPIParam[T] */] = js.Function1[/* param */ js.UndefOr[P], js.Promise[T]]
  
  type ICloudServices = org.scalablytyped.runtime.StringDictionary[typingsSlinky.wechatMiniprogram.ICloudService]
  
  type OQ[T /* <: typingsSlinky.wechatMiniprogram.anon.OptionalRecordcompletesuc */] = (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[T, typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[T, typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fail]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[T, typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.complete]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[
      T, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fail
    ]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[
      T, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.complete
    ]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[
      T, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fail | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.complete
    ]
  ])) | (typingsSlinky.wechatMiniprogram.RQ[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[
      T, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fail | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.complete | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success
    ]
  ]))
  
  type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K]}
    */ typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.Optional with org.scalablytyped.runtime.TopLevel[T]
  
  type RQ[T /* <: typingsSlinky.wechatMiniprogram.anon.OptionalRecordcompletesuc */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[
      /* keyof T */ java.lang.String, 
      typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.complete | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success | typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.fail
    ]
  ]
}
