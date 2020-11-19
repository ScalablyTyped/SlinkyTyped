package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bannerPluginMod {
  
  type BannerFunction = js.Function1[/* data */ typingsSlinky.webpack.anon.Basename, java.lang.String]
  
  type BannerPluginArgument = typingsSlinky.webpack.bannerPluginMod.BannerPluginOptions | typingsSlinky.webpack.bannerPluginMod.BannerFunction | java.lang.String
  
  type Rule = js.RegExp | java.lang.String
  
  type Rules = js.Array[typingsSlinky.webpack.bannerPluginMod.Rule] | typingsSlinky.webpack.bannerPluginMod.Rule
}
