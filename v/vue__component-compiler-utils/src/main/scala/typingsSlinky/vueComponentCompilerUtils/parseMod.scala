package typingsSlinky.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vueComponentCompilerUtils.typesMod.RawSourceMap
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typingsSlinky.vueComponentCompilerUtils.typesMod.VueTemplateCompilerParseOptions
import typingsSlinky.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("@vue/component-compiler-utils/dist/parse", "parse")
  @js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var compiler: VueTemplateCompiler = js.native
    
    var compilerParseOptions: js.UndefOr[VueTemplateCompilerParseOptions] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var needMap: js.UndefOr[Boolean] = js.native
    
    var source: String = js.native
    
    var sourceRoot: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(compiler: VueTemplateCompiler, source: String): ParseOptions = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerParseOptions(value: VueTemplateCompilerParseOptions): Self = StObject.set(x, "compilerParseOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerParseOptionsUndefined: Self = StObject.set(x, "compilerParseOptions", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setNeedMap(value: Boolean): Self = StObject.set(x, "needMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedMapUndefined: Self = StObject.set(x, "needMap", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  @js.native
  trait SFCBlock extends SFCCustomBlock {
    
    var lang: js.UndefOr[String] = js.native
    
    var module: js.UndefOr[String | Boolean] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object SFCBlock {
    
    @scala.inline
    def apply(
      attrs: StringDictionary[String | `true`],
      content: String,
      end: Double,
      start: Double,
      `type`: String
    ): SFCBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCBlock]
    }
    
    @scala.inline
    implicit class SFCBlockMutableBuilder[Self <: SFCBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setModule(value: String | Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait SFCCustomBlock extends StObject {
    
    var attrs: StringDictionary[String | `true`] = js.native
    
    var content: String = js.native
    
    var end: Double = js.native
    
    var map: js.UndefOr[RawSourceMap] = js.native
    
    var start: Double = js.native
    
    var `type`: String = js.native
  }
  object SFCCustomBlock {
    
    @scala.inline
    def apply(
      attrs: StringDictionary[String | `true`],
      content: String,
      end: Double,
      start: Double,
      `type`: String
    ): SFCCustomBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCCustomBlock]
    }
    
    @scala.inline
    implicit class SFCCustomBlockMutableBuilder[Self <: SFCCustomBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SFCDescriptor extends StObject {
    
    var customBlocks: js.Array[SFCCustomBlock] = js.native
    
    var script: SFCBlock | Null = js.native
    
    var styles: js.Array[SFCBlock] = js.native
    
    var template: SFCBlock | Null = js.native
  }
  object SFCDescriptor {
    
    @scala.inline
    def apply(customBlocks: js.Array[SFCCustomBlock], styles: js.Array[SFCBlock]): SFCDescriptor = {
      val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCDescriptor]
    }
    
    @scala.inline
    implicit class SFCDescriptorMutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomBlocks(value: js.Array[SFCCustomBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBlocksVarargs(value: SFCCustomBlock*): Self = StObject.set(x, "customBlocks", js.Array(value :_*))
      
      @scala.inline
      def setScript(value: SFCBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptNull: Self = StObject.set(x, "script", null)
      
      @scala.inline
      def setStyles(value: js.Array[SFCBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: SFCBlock*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: SFCBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNull: Self = StObject.set(x, "template", null)
    }
  }
}
