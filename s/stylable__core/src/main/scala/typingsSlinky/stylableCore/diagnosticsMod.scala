package typingsSlinky.stylableCore

import typingsSlinky.postcss.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("@stylable/core/cjs/diagnostics", "Diagnostics")
  @js.native
  class Diagnostics () extends StObject {
    def this(reports: js.Array[Diagnostic]) = this()
    
    def add(`type`: DiagnosticType, node: Node, message: String): Unit = js.native
    def add(`type`: DiagnosticType, node: Node, message: String, options: DiagnosticOptions): Unit = js.native
    
    def error(node: Node, message: String): Unit = js.native
    def error(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
    
    var reports: js.Array[Diagnostic] = js.native
    
    def warn(node: Node, message: String): Unit = js.native
    def warn(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
  }
  
  @js.native
  trait Diagnostic extends StObject {
    
    var message: String = js.native
    
    var node: Node = js.native
    
    var options: DiagnosticOptions = js.native
    
    var `type`: DiagnosticType = js.native
  }
  object Diagnostic {
    
    @scala.inline
    def apply(message: String, node: Node, options: DiagnosticOptions, `type`: DiagnosticType): Diagnostic = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    @scala.inline
    implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: DiagnosticOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DiagnosticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiagnosticOptions extends StObject {
    
    var word: js.UndefOr[String] = js.native
  }
  object DiagnosticOptions {
    
    @scala.inline
    def apply(): DiagnosticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnosticOptions]
    }
    
    @scala.inline
    implicit class DiagnosticOptionsMutableBuilder[Self <: DiagnosticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stylableCore.stylableCoreStrings.error
    - typingsSlinky.stylableCore.stylableCoreStrings.warning
  */
  trait DiagnosticType extends StObject
  object DiagnosticType {
    
    @scala.inline
    def error: typingsSlinky.stylableCore.stylableCoreStrings.error = "error".asInstanceOf[typingsSlinky.stylableCore.stylableCoreStrings.error]
    
    @scala.inline
    def warning: typingsSlinky.stylableCore.stylableCoreStrings.warning = "warning".asInstanceOf[typingsSlinky.stylableCore.stylableCoreStrings.warning]
  }
}
