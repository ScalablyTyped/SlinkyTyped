package typingsSlinky.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uglifyJs.mod.MinifyOptions
import typingsSlinky.uglifyJs.mod.MinifyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uglify-es", "InlineFunctions")
  @js.native
  object InlineFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyJs.mod.InlineFunctions with Double] = js.native
    
    /* 0 */ val Disabled: typingsSlinky.uglifyJs.mod.InlineFunctions.Disabled with Double = js.native
    
    /* 1 */ val SimpleFunctions: typingsSlinky.uglifyJs.mod.InlineFunctions.SimpleFunctions with Double = js.native
    
    /* 2 */ val WithArguments: typingsSlinky.uglifyJs.mod.InlineFunctions.WithArguments with Double = js.native
    
    /* 3 */ val WithArgumentsAndVariables: typingsSlinky.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
  }
  
  @JSImport("uglify-es", "OutputQuoteStyle")
  @js.native
  object OutputQuoteStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uglifyJs.mod.OutputQuoteStyle with Double] = js.native
    
    /* 2 */ val AlwaysDouble: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    
    /* 3 */ val AlwaysOriginal: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    
    /* 1 */ val AlwaysSingle: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    
    /* 0 */ val PreferDouble: typingsSlinky.uglifyJs.mod.OutputQuoteStyle.PreferDouble with Double = js.native
  }
  
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: String): MinifyOutput = js.native
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  @JSImport("uglify-es", "minify")
  @js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
}
