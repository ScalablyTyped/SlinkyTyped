package typingsSlinky.webpackStatsPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object statsWriterPluginMod {
  /**
    * transform function
    */
  type TransformFunc = js.Function2[
    /* data */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* options */ js.UndefOr[typingsSlinky.webpackStatsPlugin.statsWriterPluginMod.TransformOptions], 
    java.lang.String | js.Promise[java.lang.String]
  ]
}
