package typingsSlinky.stampit.mod.stampit

import typingsSlinky.stampit.mod.PropertyMap
import typingsSlinky.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `stampit`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
@js.native
trait ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */]
  extends Descriptor[Obj, S̤t̤a̤m̤p̤]
     with Composable {
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
  var conf: js.UndefOr[PropertyMap] = js.native
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
  var deepConf: js.UndefOr[PropertyMap] = js.native
  /** A set of properties that will be added to new object instances by deep property merge. */
  var deepProps: js.UndefOr[PropertyMap] = js.native
  /** A set of static properties that will be added to the `Stamp` by deep property merge. */
  var deepStatics: js.UndefOr[PropertyMap] = js.native
  /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
  var init: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.native
  // TODO: Add description
  var name: js.UndefOr[String] = js.native
  /** A set of properties that will be added to new object instances by assignment. */
  var props: js.UndefOr[PropertyMap] = js.native
  /** A set of static properties that will be copied by assignment to the `Stamp`. */
  var statics: js.UndefOr[PropertyMap] = js.native
}

object ExtendedDescriptor {
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤](): ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class ExtendedDescriptorOps[Self[obj, s̤t̤a̤m̤p̤] <: ExtendedDescriptor[obj, s̤t̤a̤m̤p̤], Obj, S̤t̤a̤m̤p̤] (val x: Self[Obj, S̤t̤a̤m̤p̤]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Obj, S̤t̤a̤m̤p̤] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Obj, S̤t̤a̤m̤p̤]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Obj, S̤t̤a̤m̤p̤]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Obj, S̤t̤a̤m̤p̤]) with Other]
    @scala.inline
    def withConf(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConf: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conf")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepConf(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepConf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepConf: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepConf")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepProps(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepProps: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepStatics(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepStatics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepStatics: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepStatics")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withStatics(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatics: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(js.undefined)
        ret
    }
  }
  
}

