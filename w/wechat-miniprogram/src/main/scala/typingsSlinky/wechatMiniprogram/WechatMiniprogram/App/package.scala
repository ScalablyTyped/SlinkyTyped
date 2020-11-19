package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object App {
  
  type Constructor = js.Function1[
    /* options */ typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.Options[typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject], 
    scala.Unit
  ]
  
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.GetAppOption], 
    typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.Instance[typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject]
  ]
  
  type Instance[T /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.Option with T
  
  type Options[T /* <: typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typingsSlinky.wechatMiniprogram.anon.PartialOption with T with typingsSlinky.std.ThisType[typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.Instance[T]]
  
  type TrivialInstance = typingsSlinky.wechatMiniprogram.WechatMiniprogram.App.Instance[typingsSlinky.wechatMiniprogram.WechatMiniprogram.IAnyObject]
}
