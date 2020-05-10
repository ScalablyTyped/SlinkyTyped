package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Pair
import typingsSlinky.yaml.typesMod.Pair.Type.MERGE_PAIR
import typingsSlinky.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merge extends Pair {
  /** Always Scalar('<<'), defined by the type specification */
  @JSName("key")
  var key_Merge: PlainValue = js.native
  @JSName("type")
  var type_Merge: MERGE_PAIR = js.native
  /** Always YAMLSeq<Alias(Map)>, stringified as *A if length = 1 */
  @JSName("value")
  var value_Merge: YAMLSeq = js.native
}

