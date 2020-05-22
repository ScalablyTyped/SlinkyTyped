package typingsSlinky.urqlCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql.graphql.GraphQLError> */
trait PartialGraphQLError extends js.Object {
  var constructor: js.UndefOr[
    js.Function7[
      /* message */ String, 
      /* nodes */ js.UndefOr[js.Array[ASTNode]], 
      /* source */ js.UndefOr[Maybe[typingsSlinky.graphql.sourceMod.Source]], 
      /* positions */ js.UndefOr[Maybe[js.Array[Double]]], 
      /* path */ js.UndefOr[Maybe[js.Array[String | Double]]], 
      /* originalError */ js.UndefOr[Maybe[js.Error]], 
      /* extensions */ js.UndefOr[Maybe[StringDictionary[_]]], 
      js.Any
    ]
  ] = js.undefined
  var extensions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var locations: js.UndefOr[js.Array[SourceLocation]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nodes: js.UndefOr[js.Array[ASTNode]] = js.undefined
  var originalError: js.UndefOr[Maybe[js.Error]] = js.undefined
  var path: js.UndefOr[js.Array[String | Double]] = js.undefined
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
  var source: js.UndefOr[typingsSlinky.graphql.sourceMod.Source] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object PartialGraphQLError {
  @scala.inline
  def apply(
    constructor: (/* message */ String, /* nodes */ js.UndefOr[js.Array[ASTNode]], /* source */ js.UndefOr[Maybe[typingsSlinky.graphql.sourceMod.Source]], /* positions */ js.UndefOr[Maybe[js.Array[Double]]], /* path */ js.UndefOr[Maybe[js.Array[String | Double]]], /* originalError */ js.UndefOr[Maybe[js.Error]], /* extensions */ js.UndefOr[Maybe[StringDictionary[_]]]) => js.Any = null,
    extensions: StringDictionary[js.Any] = null,
    locations: js.Array[SourceLocation] = null,
    message: String = null,
    name: String = null,
    nodes: js.Array[ASTNode] = null,
    originalError: js.UndefOr[Null | Maybe[js.Error]] = js.undefined,
    path: js.Array[String | Double] = null,
    positions: js.Array[Double] = null,
    source: typingsSlinky.graphql.sourceMod.Source = null,
    stack: String = null
  ): PartialGraphQLError = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction7(constructor))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (!js.isUndefined(originalError)) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGraphQLError]
  }
}

