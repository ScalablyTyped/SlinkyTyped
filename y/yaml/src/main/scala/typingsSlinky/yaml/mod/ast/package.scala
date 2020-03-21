package typingsSlinky.yaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ast {
  type DocumentConstructor = org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* options */ typingsSlinky.yaml.mod.ParseOptions], 
    typingsSlinky.yaml.mod.ast.Document
  ]
  type MapConstructor = org.scalablytyped.runtime.Instantiable0[typingsSlinky.yaml.mod.ast.MapBase]
  type PairConstructor = org.scalablytyped.runtime.Instantiable2[
    /* key */ typingsSlinky.yaml.mod.ast.AstNode | scala.Null, 
    js.UndefOr[typingsSlinky.yaml.mod.ast.AstNode | scala.Null], 
    typingsSlinky.yaml.mod.ast.Pair
  ]
  type ScalarConstructor = org.scalablytyped.runtime.Instantiable1[
    /* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, 
    typingsSlinky.yaml.mod.ast.Scalar
  ]
  type SeqConstructor = org.scalablytyped.runtime.Instantiable0[typingsSlinky.yaml.mod.ast.SeqBase]
}
