package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind with java.lang.String] = js.native
  
  @js.native
  sealed trait alias extends ScriptElementKind
  /* "alias" */ val alias: typingsSlinky.typescript.mod.ScriptElementKind.alias with java.lang.String = js.native
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement extends ScriptElementKind
  /* "call" */ val callSignatureElement: typingsSlinky.typescript.mod.ScriptElementKind.callSignatureElement with java.lang.String = js.native
  
  /** class X {} */
  @js.native
  sealed trait classElement extends ScriptElementKind
  /* "class" */ val classElement: typingsSlinky.typescript.mod.ScriptElementKind.classElement with java.lang.String = js.native
  
  @js.native
  sealed trait constElement extends ScriptElementKind
  /* "const" */ val constElement: typingsSlinky.typescript.mod.ScriptElementKind.constElement with java.lang.String = js.native
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement extends ScriptElementKind
  /* "construct" */ val constructSignatureElement: typingsSlinky.typescript.mod.ScriptElementKind.constructSignatureElement with java.lang.String = js.native
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement extends ScriptElementKind
  /* "constructor" */ val constructorImplementationElement: typingsSlinky.typescript.mod.ScriptElementKind.constructorImplementationElement with java.lang.String = js.native
  
  @js.native
  sealed trait directory extends ScriptElementKind
  /* "directory" */ val directory: typingsSlinky.typescript.mod.ScriptElementKind.directory with java.lang.String = js.native
  
  /** enum E */
  @js.native
  sealed trait enumElement extends ScriptElementKind
  /* "enum" */ val enumElement: typingsSlinky.typescript.mod.ScriptElementKind.enumElement with java.lang.String = js.native
  
  @js.native
  sealed trait enumMemberElement extends ScriptElementKind
  /* "enum member" */ val enumMemberElement: typingsSlinky.typescript.mod.ScriptElementKind.enumMemberElement with java.lang.String = js.native
  
  @js.native
  sealed trait externalModuleName extends ScriptElementKind
  /* "external module name" */ val externalModuleName: typingsSlinky.typescript.mod.ScriptElementKind.externalModuleName with java.lang.String = js.native
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement extends ScriptElementKind
  /* "function" */ val functionElement: typingsSlinky.typescript.mod.ScriptElementKind.functionElement with java.lang.String = js.native
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement extends ScriptElementKind
  /* "index" */ val indexSignatureElement: typingsSlinky.typescript.mod.ScriptElementKind.indexSignatureElement with java.lang.String = js.native
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement extends ScriptElementKind
  /* "interface" */ val interfaceElement: typingsSlinky.typescript.mod.ScriptElementKind.interfaceElement with java.lang.String = js.native
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute extends ScriptElementKind
  /* "JSX attribute" */ val jsxAttribute: typingsSlinky.typescript.mod.ScriptElementKind.jsxAttribute with java.lang.String = js.native
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword extends ScriptElementKind
  /* "keyword" */ val keyword: typingsSlinky.typescript.mod.ScriptElementKind.keyword with java.lang.String = js.native
  
  @js.native
  sealed trait label extends ScriptElementKind
  /* "label" */ val label: typingsSlinky.typescript.mod.ScriptElementKind.label with java.lang.String = js.native
  
  @js.native
  sealed trait letElement extends ScriptElementKind
  /* "let" */ val letElement: typingsSlinky.typescript.mod.ScriptElementKind.letElement with java.lang.String = js.native
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement extends ScriptElementKind
  /* "local class" */ val localClassElement: typingsSlinky.typescript.mod.ScriptElementKind.localClassElement with java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement extends ScriptElementKind
  /* "local function" */ val localFunctionElement: typingsSlinky.typescript.mod.ScriptElementKind.localFunctionElement with java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement extends ScriptElementKind
  /* "local var" */ val localVariableElement: typingsSlinky.typescript.mod.ScriptElementKind.localVariableElement with java.lang.String = js.native
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement extends ScriptElementKind
  /* "method" */ val memberFunctionElement: typingsSlinky.typescript.mod.ScriptElementKind.memberFunctionElement with java.lang.String = js.native
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement extends ScriptElementKind
  /* "getter" */ val memberGetAccessorElement: typingsSlinky.typescript.mod.ScriptElementKind.memberGetAccessorElement with java.lang.String = js.native
  
  @js.native
  sealed trait memberSetAccessorElement extends ScriptElementKind
  /* "setter" */ val memberSetAccessorElement: typingsSlinky.typescript.mod.ScriptElementKind.memberSetAccessorElement with java.lang.String = js.native
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement extends ScriptElementKind
  /* "property" */ val memberVariableElement: typingsSlinky.typescript.mod.ScriptElementKind.memberVariableElement with java.lang.String = js.native
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement extends ScriptElementKind
  /* "module" */ val moduleElement: typingsSlinky.typescript.mod.ScriptElementKind.moduleElement with java.lang.String = js.native
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement extends ScriptElementKind
  /* "parameter" */ val parameterElement: typingsSlinky.typescript.mod.ScriptElementKind.parameterElement with java.lang.String = js.native
  
  @js.native
  sealed trait primitiveType extends ScriptElementKind
  /* "primitive type" */ val primitiveType: typingsSlinky.typescript.mod.ScriptElementKind.primitiveType with java.lang.String = js.native
  
  /** top level script node */
  @js.native
  sealed trait scriptElement extends ScriptElementKind
  /* "script" */ val scriptElement: typingsSlinky.typescript.mod.ScriptElementKind.scriptElement with java.lang.String = js.native
  
  /** String literal */
  @js.native
  sealed trait string extends ScriptElementKind
  /* "string" */ val string: typingsSlinky.typescript.mod.ScriptElementKind.string with java.lang.String = js.native
  
  /** type T = ... */
  @js.native
  sealed trait typeElement extends ScriptElementKind
  /* "type" */ val typeElement: typingsSlinky.typescript.mod.ScriptElementKind.typeElement with java.lang.String = js.native
  
  @js.native
  sealed trait typeParameterElement extends ScriptElementKind
  /* "type parameter" */ val typeParameterElement: typingsSlinky.typescript.mod.ScriptElementKind.typeParameterElement with java.lang.String = js.native
  
  @js.native
  sealed trait unknown extends ScriptElementKind
  /* "" */ val unknown: typingsSlinky.typescript.mod.ScriptElementKind.unknown with java.lang.String = js.native
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement extends ScriptElementKind
  /* "var" */ val variableElement: typingsSlinky.typescript.mod.ScriptElementKind.variableElement with java.lang.String = js.native
  
  @js.native
  sealed trait warning extends ScriptElementKind
  /* "warning" */ val warning: typingsSlinky.typescript.mod.ScriptElementKind.warning with java.lang.String = js.native
}
