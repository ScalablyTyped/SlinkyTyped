package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.streamAnonymousStreamMod.AnonymousStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/binding/nodejs/NodeOperator", JSImport.Namespace)
@js.native
object nodejsNodeOperatorMod extends js.Object {
  var fromNodeCallback: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    js.Function1[/* repeated */ js.Any, AnonymousStream]
  ] = js.native
  var fromReadableStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
  var fromStream: js.Function2[/* stream */ js.Any, /* finishEventName */ js.UndefOr[String], AnonymousStream] = js.native
  var fromTransformStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
  var fromWritableStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
}

