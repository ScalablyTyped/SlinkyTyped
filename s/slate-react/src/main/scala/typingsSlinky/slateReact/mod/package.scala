package typingsSlinky.slateReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorProps[T /* <: typingsSlinky.slate.mod.Controller */] = typingsSlinky.slateReact.mod.BasicEditorProps[T] with typingsSlinky.slateReact.mod.Plugin[T]
  type EventHook[T] = js.Function3[
    /* event */ T, 
    /* editor */ typingsSlinky.slateReact.mod.Editor, 
    /* next */ js.Function0[js.Any], 
    js.Any
  ]
  type OnChangeFn = js.Function1[/* change */ typingsSlinky.slateReact.mod.OnChangeParam, js.Any]
  type RenderAttributes = org.scalablytyped.runtime.StringDictionary[js.Any]
}
