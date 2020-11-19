package typingsSlinky.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uglifyJs.mod.MinifyOptions
import typingsSlinky.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uglify-es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  
  @js.native
  object InlineFunctions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyJs.mod.InlineFunctions with Double] = js.native
    
    /* 0 */ val Disabled: typingsSlinky.uglifyJs.mod.InlineFunctions.Disabled with Double = js.native
    
    /* 1 */ val SimpleFunctions: typingsSlinky.uglifyJs.mod.InlineFunctions.SimpleFunctions with Double = js.native
    
    /* 2 */ val WithArguments: typingsSlinky.uglifyJs.mod.InlineFunctions.WithArguments with Double = js.native
    
    /* 3 */ val WithArgumentsAndVariables: typingsSlinky.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
  }
  
  @js.native
  object OutputQuoteStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyJs.mod.OutputQuoteStyle with Double] = js.native
    
    /* 2 */ val AlwaysDouble: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    
    /* 3 */ val AlwaysOriginal: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    
    /* 1 */ val AlwaysSingle: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    
    /* 0 */ val PreferDouble: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.PreferDouble with Double = js.native
  }
}
