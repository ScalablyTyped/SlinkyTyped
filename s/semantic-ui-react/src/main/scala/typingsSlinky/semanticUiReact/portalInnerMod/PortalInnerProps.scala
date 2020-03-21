package typingsSlinky.semanticUiReact.portalInnerMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalInnerProps
  extends StrictPortalInnerProps
     with /* key */ StringDictionary[js.Any]

object PortalInnerProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    innerRef: Ref[_] = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null
  ): PortalInnerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    __obj.asInstanceOf[PortalInnerProps]
  }
}

