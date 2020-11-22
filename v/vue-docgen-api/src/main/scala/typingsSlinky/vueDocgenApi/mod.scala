package typingsSlinky.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.ClassDeclaration_
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import typingsSlinky.vueDocgenApi.documentationMod.default
import typingsSlinky.vueDocgenApi.parseMod.DocGenOptions
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import typingsSlinky.vueDocgenApi.parseScriptMod.Handler
import typingsSlinky.vueDocgenApi.parseTemplateMod.TemplateParserOptions
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cleanName(name: String): String = js.native
  
  def getDefaultExample(doc: ComponentDoc): String = js.native
  
  def parse(filePath: String): js.Promise[ComponentDoc] = js.native
  def parse(filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  def parse(filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
  
  def parseMulti(filePath: String): js.Promise[js.Array[ComponentDoc]] = js.native
  def parseMulti(filePath: String, opts: DocGenOptions): js.Promise[js.Array[ComponentDoc]] = js.native
  
  def parseSource(source: String, filePath: String): js.Promise[ComponentDoc] = js.native
  def parseSource(source: String, filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  def parseSource(source: String, filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
  
  @js.native
  class Documentation protected () extends default {
    def this(fullFilePath: String) = this()
  }
  
  @js.native
  object ScriptHandlers extends js.Object {
    
    def classDisplayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def classMethodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def classPropHandler(
      documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
      path: NodePath[ClassDeclaration_, _]
    ): js.Promise[Unit] = js.native
    
    def componentHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    val default: js.Array[Handler] = js.native
    
    def displayNameHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, compDef: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def eventHandler(
      documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
      path: NodePath[_, _],
      astPath: File_
    ): js.Promise[Unit] = js.native
    
    def extendsHandler(
      documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    def methodHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def mixinsHandler(
      documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    val preHandlers: js.Array[Handler] = js.native
    
    def propHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandler(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandlerFunctional(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandlerLitteral(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  }
  
  @js.native
  object TemplateHandlers extends js.Object {
    
    val default: js.Array[
        js.Function4[
          /* documentation */ typingsSlinky.vueDocgenApi.documentationMod.default, 
          /* templateAst */ TemplateChildNode, 
          /* siblings */ js.Array[TemplateChildNode], 
          /* options */ TemplateParserOptions, 
          Unit
        ]
      ] = js.native
  }
}
