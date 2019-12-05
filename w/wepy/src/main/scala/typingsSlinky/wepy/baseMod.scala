package typingsSlinky.wepy

import typingsSlinky.wepy.appMod.AppConfig
import typingsSlinky.wepy.appMod.AppConstructor
import typingsSlinky.wepy.pageMod.PageConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("$createApp")
    var $createApp: js.UndefOr[
        js.Function2[
          /* appClass */ AppConstructor, 
          /* appConfig */ AppConfig, 
          typingsSlinky.wepy.appMod.default
        ]
      ] = js.native
    @JSName("$createPage")
    var $createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ PageConstructor, 
          /* pagePath */ String | Boolean, 
          typingsSlinky.wepy.pageMod.default
        ]
      ] = js.native
  }
  
}

