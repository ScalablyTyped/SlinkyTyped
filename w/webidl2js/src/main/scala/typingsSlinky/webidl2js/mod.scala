package typingsSlinky.webidl2js

import typingsSlinky.webidl2.mod.AttributeMemberType
import typingsSlinky.webidl2js.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webidl2js", JSImport.Namespace)
  @js.native
  class ^ () extends Transformer {
    def this(opts: Options) = this()
  }
  
  type AttributeProcessor = js.ThisFunction2[/* this */ ProcessorContext, /* idl */ AttributeMemberType, /* implName */ String, Get]
  
  type CodeProcessor = js.ThisFunction1[/* this */ ProcessorContext, /* code */ String, String]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The optional suffix present on implementation files.
      *
      * @default ""
      */
    var implSuffix: js.UndefOr[String] = js.native
    
    /**
      * The function used to modify attributes and operations
      * with the `[CEReactions]` extended attribute.
      *
      * The default value is the identity function.
      */
    var processCEReactions: js.UndefOr[CodeProcessor] = js.native
    
    /**
      * The function used to modify attributes and operations
      * with the `[HTMLConstructor]` extended attribute.
      *
      * The default value is the identity function.
      */
    var processHTMLConstructor: js.UndefOr[CodeProcessor] = js.native
    
    /**
      * The function used to generate attributes and operations
      * with the `[Reflect]` extended attribute.
      *
      * @default null
      */
    var processReflect: js.UndefOr[AttributeProcessor | Null] = js.native
    
    /**
      * Whether non-fatal errors should be ignored.
      *
      * @default false
      */
    var suppressErrors: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplSuffix(value: String): Self = StObject.set(x, "implSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplSuffixUndefined: Self = StObject.set(x, "implSuffix", js.undefined)
      
      @scala.inline
      def setProcessCEReactions(value: CodeProcessor): Self = StObject.set(x, "processCEReactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessCEReactionsUndefined: Self = StObject.set(x, "processCEReactions", js.undefined)
      
      @scala.inline
      def setProcessHTMLConstructor(value: CodeProcessor): Self = StObject.set(x, "processHTMLConstructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessHTMLConstructorUndefined: Self = StObject.set(x, "processHTMLConstructor", js.undefined)
      
      @scala.inline
      def setProcessReflect(value: AttributeProcessor): Self = StObject.set(x, "processReflect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessReflectNull: Self = StObject.set(x, "processReflect", null)
      
      @scala.inline
      def setProcessReflectUndefined: Self = StObject.set(x, "processReflect", js.undefined)
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
    }
  }
  
  @js.native
  trait ProcessorContext extends StObject {
    
    /**
      * @param specifier The import specifier.
      * @param property The imported property, when undefined or empty,
      *        then the whole module namespace will be imported.
      * @return The identifier referring to this imported value.
      */
    def addImport(specifier: String): String = js.native
    def addImport(specifier: String, property: String): String = js.native
  }
  
  @js.native
  trait Transformer extends StObject {
    
    /**
      * @param idl The WebIDL file or directory of WebIDL files
      *        to generate wrappers for.
      * @param impl The directory containing implementation files
      *        for the provided WebIDL file(s).
      */
    def addSource(idl: String, impl: String): this.type = js.native
    
    /**
      * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
      * in the supplied output directory.
      *
      * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
      * @return A promise that will be resolved once all files have been written,
      *         or rejected if an error was encountered.
      */
    def generate(outputDir: String): js.Promise[Unit] = js.native
  }
  object Transformer {
    
    @scala.inline
    def apply(addSource: (String, String) => Transformer, generate: String => js.Promise[Unit]): Transformer = {
      val __obj = js.Dynamic.literal(addSource = js.Any.fromFunction2(addSource), generate = js.Any.fromFunction1(generate))
      __obj.asInstanceOf[Transformer]
    }
    
    @scala.inline
    implicit class TransformerMutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSource(value: (String, String) => Transformer): Self = StObject.set(x, "addSource", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerate(value: String => js.Promise[Unit]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    }
  }
}
