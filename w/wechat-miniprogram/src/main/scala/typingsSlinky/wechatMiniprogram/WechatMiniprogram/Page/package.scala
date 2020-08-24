package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type Constructor = js.Function1[
    /* options */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Options[
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.DataOption, 
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.CustomOption
    ], 
    scala.Unit
  ]
  type CustomOption = typingsSlinky.std.Record[java.lang.String, js.Any]
  type DataOption = typingsSlinky.std.Record[java.lang.String, js.Any]
  type Instance[TData /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.DataOption */, TCustom /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.CustomOption */] = typingsSlinky.wechatMiniprogram.anon.OptionalInterfaceILifetim with typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.InstanceProperties with typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.InstanceMethods[TData] with typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Data[TData] with TCustom
  type InstanceMethods[D /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.DataOption */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component.InstanceMethods[D]
  type Options[TData /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.DataOption */, TCustom /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.CustomOption */] = TCustom with typingsSlinky.std.Partial[typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Data[TData]] with typingsSlinky.wechatMiniprogram.anon.PartialILifetime with (typingsSlinky.std.ThisType[typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Instance[TData, TCustom]])
  type TrivialInstance = typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Instance[
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  type getCurrentPages = js.Function0[
    js.Array[
      typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.Instance[
        typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
        typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject
      ]
    ]
  ]
}
