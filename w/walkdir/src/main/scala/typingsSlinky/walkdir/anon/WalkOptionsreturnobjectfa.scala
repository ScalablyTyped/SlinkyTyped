package typingsSlinky.walkdir.anon

import typingsSlinky.walkdir.walkdirBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object ? :false} */
@js.native
trait WalkOptionsreturnobjectfa extends js.Object {
  /**
    * filter. filter an array of paths from readdir
    */
  var filter: js.UndefOr[
    js.Function2[
      /* directory */ String, 
      /* files */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.native
  /*** 
    * default True. if false this will use stat insteqad of lstat and not find links at all.
    */
  var find_links: js.UndefOr[Boolean] = js.native
  /**
    * follow symlinks. default FALSE
    */
  var follow_symlinks: js.UndefOr[Boolean] = js.native
  /**
    * provide an alternate implementation of fs like graceful-fs
    */
  var fs: js.UndefOr[js.Any] = js.native
  /**
    * only travel to max depth. emits an error if hit.
    */
  var max_depth: js.UndefOr[Double] = js.native
  /**
    * only go one level deep. convenience param.
    */ 
  var no_recurse: js.UndefOr[Boolean] = js.native
   // if true the sync return will be in {path:stat} format instead of [path,path,...]
  /**
    * dont build up an internal list or object of all of the paths. this can be an important optimization for listing HUGE trees.
    */
  var no_return: js.UndefOr[Boolean] = js.native
  /**
    * return an object of {path:stat} instead of just the resolved path names
    */
  var return_object: js.UndefOr[Boolean with `false`] = js.native
  /**
    * make this syncronous. the same as calling walkdir.sync
    */
  var sync: js.UndefOr[Boolean] = js.native
  /**
    * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
    * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
    */
  var track_inodes: js.UndefOr[Boolean] = js.native
}

object WalkOptionsreturnobjectfa {
  @scala.inline
  def apply(): WalkOptionsreturnobjectfa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsreturnobjectfa]
  }
  @scala.inline
  implicit class WalkOptionsreturnobjectfaOps[Self <: WalkOptionsreturnobjectfa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(
      value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFind_links(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFind_links: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find_links")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow_symlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_symlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow_symlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_symlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_depth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_depth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_recurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_recurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_recurse")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_return(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_return: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_return")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_object(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_object: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_object")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack_inodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_inodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_inodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_inodes")(js.undefined)
        ret
    }
  }
  
}

