package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterConverterMod.Converter
import typingsSlinky.typedoc.distLibModelsMod.ProjectReflection
import typingsSlinky.typedoc.distLibModelsMod.Reflection
import typingsSlinky.typedoc.distLibModelsMod.Type
import typingsSlinky.typedoc.distLibUtilsLoggersMod.Logger
import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.MapLike
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.NodeArray
import typingsSlinky.typescript.typescriptMod.Program
import typingsSlinky.typescript.typescriptMod.SourceFile
import typingsSlinky.typescript.typescriptMod.Symbol
import typingsSlinky.typescript.typescriptMod.TypeChecker
import typingsSlinky.typescript.typescriptMod.TypeNode
import typingsSlinky.typescript.typescriptMod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/context", JSImport.Namespace)
@js.native
object distLibConverterContextMod extends js.Object {
  @js.native
  class Context protected () extends js.Object {
    def this(converter: Converter, fileNames: js.Array[String], checker: TypeChecker, program: Program) = this()
    var checker: TypeChecker = js.native
    var converter: Converter = js.native
    var externalPattern: js.UndefOr[js.Any] = js.native
    var extractTypeParameters: js.Any = js.native
    var fileNames: js.Array[String] = js.native
    var inheritParent: js.UndefOr[Node] = js.native
    var inherited: js.UndefOr[js.Array[String]] = js.native
    var inheritedChildren: js.UndefOr[js.Array[Double]] = js.native
    var isDeclaration: js.UndefOr[Boolean] = js.native
    var isExternal: js.UndefOr[Boolean] = js.native
    var isInherit: js.UndefOr[Boolean] = js.native
    var program: Program = js.native
    var project: ProjectReflection = js.native
    var scope: Reflection = js.native
    var symbolID: js.Any = js.native
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
    var typeParameters: js.UndefOr[MapLike[Type]] = js.native
    var visitStack: js.Array[Node] = js.native
    def getCompilerOptions(): CompilerOptions = js.native
    def getLogger(): Logger = js.native
    def getSymbolID(): js.UndefOr[Double] = js.native
    def getSymbolID(symbol: Symbol): js.UndefOr[Double] = js.native
    def getTypeAtLocation(node: Node): js.UndefOr[typingsSlinky.typescript.typescriptMod.Type] = js.native
    def inherit(baseNode: Node): Reflection = js.native
    def inherit(baseNode: Node, typeArguments: NodeArray[TypeNode]): Reflection = js.native
    def registerReflection(reflection: Reflection): Unit = js.native
    def registerReflection(reflection: Reflection, node: Node): Unit = js.native
    def registerReflection(reflection: Reflection, node: Node, symbol: Symbol): Unit = js.native
    def trigger(name: String, reflection: Reflection): Unit = js.native
    def trigger(name: String, reflection: Reflection, node: Node): Unit = js.native
    def withScope(scope: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def withScope(
      scope: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(
      scope: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      preserve: Boolean,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(
      scope: js.UndefOr[scala.Nothing],
      parameters: NodeArray[TypeParameterDeclaration],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(
      scope: js.UndefOr[scala.Nothing],
      parameters: NodeArray[TypeParameterDeclaration],
      preserve: Boolean,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(scope: Reflection, callback: js.Function0[Unit]): Unit = js.native
    def withScope(scope: Reflection, parameters: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def withScope(
      scope: Reflection,
      parameters: js.UndefOr[scala.Nothing],
      preserve: Boolean,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(scope: Reflection, parameters: NodeArray[TypeParameterDeclaration], callback: js.Function0[Unit]): Unit = js.native
    def withScope(
      scope: Reflection,
      parameters: NodeArray[TypeParameterDeclaration],
      preserve: Boolean,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withSourceFile(node: SourceFile, callback: js.Function): Unit = js.native
  }
  
}

