package typingsSlinky.weappDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object weappDashApiMod {
  import typingsSlinky.weappDashApi.weappDashApiMod.wx.AppOptions
  import typingsSlinky.weappDashApi.weappDashApiMod.wx.PageOptions

  type AppConstructor = js.Function1[/* options */ AppOptions, Unit]
  type PageConstructor = js.Function1[/* options */ PageOptions, Unit]
}
