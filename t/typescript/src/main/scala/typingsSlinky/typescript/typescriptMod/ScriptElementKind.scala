package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKind extends js.Object

@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  @js.native
  sealed trait alias extends ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement extends ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement extends ScriptElementKind
  
  @js.native
  sealed trait constElement extends ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement extends ScriptElementKind
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement extends ScriptElementKind
  
  @js.native
  sealed trait directory extends ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement extends ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement extends ScriptElementKind
  
  @js.native
  sealed trait externalModuleName extends ScriptElementKind
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement extends ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement extends ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement extends ScriptElementKind
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute extends ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword extends ScriptElementKind
  
  @js.native
  sealed trait label extends ScriptElementKind
  
  @js.native
  sealed trait letElement extends ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement extends ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement extends ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement extends ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement extends ScriptElementKind
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement extends ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement extends ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement extends ScriptElementKind
  
  @js.native
  sealed trait primitiveType extends ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement extends ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string extends ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement extends ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement extends ScriptElementKind
  
  @js.native
  sealed trait unknown extends ScriptElementKind
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement extends ScriptElementKind
  
  @js.native
  sealed trait warning extends ScriptElementKind
  
  /* "alias" */ val alias: typingsSlinky.typescript.typescriptMod.ScriptElementKind.alias with String = js.native
  /* "call" */ val callSignatureElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.callSignatureElement with String = js.native
  /* "class" */ val classElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.classElement with String = js.native
  /* "const" */ val constElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.constElement with String = js.native
  /* "construct" */ val constructSignatureElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.constructSignatureElement with String = js.native
  /* "constructor" */ val constructorImplementationElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.constructorImplementationElement with String = js.native
  /* "directory" */ val directory: typingsSlinky.typescript.typescriptMod.ScriptElementKind.directory with String = js.native
  /* "enum" */ val enumElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.enumElement with String = js.native
  /* "enum member" */ val enumMemberElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.enumMemberElement with String = js.native
  /* "external module name" */ val externalModuleName: typingsSlinky.typescript.typescriptMod.ScriptElementKind.externalModuleName with String = js.native
  /* "function" */ val functionElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.functionElement with String = js.native
  /* "index" */ val indexSignatureElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.indexSignatureElement with String = js.native
  /* "interface" */ val interfaceElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.interfaceElement with String = js.native
  /* "JSX attribute" */ val jsxAttribute: typingsSlinky.typescript.typescriptMod.ScriptElementKind.jsxAttribute with String = js.native
  /* "keyword" */ val keyword: typingsSlinky.typescript.typescriptMod.ScriptElementKind.keyword with String = js.native
  /* "label" */ val label: typingsSlinky.typescript.typescriptMod.ScriptElementKind.label with String = js.native
  /* "let" */ val letElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.letElement with String = js.native
  /* "local class" */ val localClassElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.localClassElement with String = js.native
  /* "local function" */ val localFunctionElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.localFunctionElement with String = js.native
  /* "local var" */ val localVariableElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.localVariableElement with String = js.native
  /* "method" */ val memberFunctionElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.memberFunctionElement with String = js.native
  /* "getter" */ val memberGetAccessorElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.memberGetAccessorElement with String = js.native
  /* "setter" */ val memberSetAccessorElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.memberSetAccessorElement with String = js.native
  /* "property" */ val memberVariableElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.memberVariableElement with String = js.native
  /* "module" */ val moduleElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.moduleElement with String = js.native
  /* "parameter" */ val parameterElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.parameterElement with String = js.native
  /* "primitive type" */ val primitiveType: typingsSlinky.typescript.typescriptMod.ScriptElementKind.primitiveType with String = js.native
  /* "script" */ val scriptElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.scriptElement with String = js.native
  /* "string" */ val string: typingsSlinky.typescript.typescriptMod.ScriptElementKind.string with String = js.native
  /* "type" */ val typeElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.typeElement with String = js.native
  /* "type parameter" */ val typeParameterElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.typeParameterElement with String = js.native
  /* "" */ val unknown: typingsSlinky.typescript.typescriptMod.ScriptElementKind.unknown with String = js.native
  /* "var" */ val variableElement: typingsSlinky.typescript.typescriptMod.ScriptElementKind.variableElement with String = js.native
  /* "warning" */ val warning: typingsSlinky.typescript.typescriptMod.ScriptElementKind.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScriptElementKind with String] = js.native
}

