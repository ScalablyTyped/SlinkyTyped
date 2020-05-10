package typingsSlinky.sift.mod

import typingsSlinky.sift.siftStrings.g
import typingsSlinky.sift.siftStrings.i
import typingsSlinky.sift.siftStrings.m
import typingsSlinky.sift.siftStrings.u
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[T /* <: SupportedTypes */] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ExternalQuery[T]] = js.native
  @JSName("$eq")
  var $eq: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[Double]] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$nor")
  var $nor: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$not")
  var $not: js.UndefOr[SiftQuery[T]] = js.native
  @JSName("$options")
  var $options: js.UndefOr[i | g | m | u] = js.native
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[js.RegExp | String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.native
  @JSName("$type")
  var $type: js.UndefOr[js.Any] = js.native
  @JSName("$where")
  var $where: js.UndefOr[String | WhereFn[T]] = js.native
}

object Query {
  @scala.inline
  def apply[T](): Query[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query[T]]
  }
  @scala.inline
  implicit class QueryOps[Self[t] <: Query[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$all(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def with$and(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$and: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.undefined)
        ret
    }
    @scala.inline
    def with$elemMatch(value: ExternalQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$elemMatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elemMatch")(js.undefined)
        ret
    }
    @scala.inline
    def with$eq(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$eq: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(js.undefined)
        ret
    }
    @scala.inline
    def with$exists(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$exists: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$exists")(js.undefined)
        ret
    }
    @scala.inline
    def with$gt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(js.undefined)
        ret
    }
    @scala.inline
    def with$gte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gte: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(js.undefined)
        ret
    }
    @scala.inline
    def with$in(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$in: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(js.undefined)
        ret
    }
    @scala.inline
    def with$lt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(js.undefined)
        ret
    }
    @scala.inline
    def with$lte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lte: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(js.undefined)
        ret
    }
    @scala.inline
    def with$mod(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$mod: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mod")(js.undefined)
        ret
    }
    @scala.inline
    def with$ne(value: /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ne: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(js.undefined)
        ret
    }
    @scala.inline
    def with$nin(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nin")(js.undefined)
        ret
    }
    @scala.inline
    def with$nor(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nor")(js.undefined)
        ret
    }
    @scala.inline
    def with$not(value: SiftQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$not: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(js.undefined)
        ret
    }
    @scala.inline
    def with$options(value: i | g | m | u): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$options: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$options")(js.undefined)
        ret
    }
    @scala.inline
    def with$or(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$or: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.undefined)
        ret
    }
    @scala.inline
    def with$regexRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$regex(value: js.RegExp | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$regex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regex")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$type: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.undefined)
        ret
    }
    @scala.inline
    def with$where(value: String | WhereFn[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$where: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$where")(js.undefined)
        ret
    }
  }
  
}

