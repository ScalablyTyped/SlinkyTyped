package typingsSlinky.uglifyDashEs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uglifyDashJs.uglifyDashJsMod.MinifyOptions
import typingsSlinky.uglifyDashJs.uglifyDashJsMod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglify-es", JSImport.Namespace)
@js.native
object uglifyDashEsMod extends js.Object {
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  @js.native
  object InlineFunctions extends js.Object {
    /* 0 */ val Disabled: typingsSlinky.uglifyDashJs.uglifyDashJsMod.InlineFunctions.Disabled with Double = js.native
    /* 1 */ val SimpleFunctions: typingsSlinky.uglifyDashJs.uglifyDashJsMod.InlineFunctions.SimpleFunctions with Double = js.native
    /* 2 */ val WithArguments: typingsSlinky.uglifyDashJs.uglifyDashJsMod.InlineFunctions.WithArguments with Double = js.native
    /* 3 */ val WithArgumentsAndVariables: typingsSlinky.uglifyDashJs.uglifyDashJsMod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyDashJs.uglifyDashJsMod.InlineFunctions with Double] = js.native
  }
  
  @js.native
  object OutputQuoteStyle extends js.Object {
    /* 2 */ val AlwaysDouble: typingsSlinky.uglifyDashJs.uglifyDashJsMod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    /* 3 */ val AlwaysOriginal: typingsSlinky.uglifyDashJs.uglifyDashJsMod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    /* 1 */ val AlwaysSingle: typingsSlinky.uglifyDashJs.uglifyDashJsMod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    /* 0 */ val PreferDouble: typingsSlinky.uglifyDashJs.uglifyDashJsMod.OutputQuoteStyle.PreferDouble with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyDashJs.uglifyDashJsMod.OutputQuoteStyle with Double] = js.native
  }
  
}

