package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeCommon {
  type ArtifactHash = java.lang.String
  type Aspect = java.lang.String
  type AttrMeta = js.Any
  type Buffer = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GLbyte */ js.Any
  ]
  type CatchCallback = typingsSlinky.webgme.GmeCommon.ErrorOnlyCallback
  type Constraint = java.lang.String
  type ContentString = java.lang.String
  type CrosscutsInfo = typingsSlinky.webgme.GmeCommon.Registry
  type DataObject = typingsSlinky.webgme.Core.Node
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorOnlyCallback = js.Function1[/* err */ js.Error | scala.Null, scala.Unit]
  type ErrorStr = java.lang.String
  type ISO8601 = java.lang.String
  type MemberId = typingsSlinky.webgme.GmeCommon.Path
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MetadataHash = java.lang.String
  type Name = java.lang.String
  type NodeId = java.lang.String
  type Path = java.lang.String
  type Registry = js.Any
  type RelId = java.lang.String
  type ResultCallback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  type SetId = java.lang.String
  type ThenCallback = typingsSlinky.webgme.GmeCommon.VoidCallback
  type VoidCallback = js.Function0[scala.Unit]
  type VoidFn = js.Function0[scala.Unit]
}
