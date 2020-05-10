package typingsSlinky.sindresorhusSlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Specifying this only replaces the default if you set an item with the same key, like `&`.
  		The replacements are run on the original string before any other transformations.
  		Add a leading and trailing space to the replacement to have it separated by dashes.
  		@default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Foo@unicorn', {
  			customReplacements: [
  				['@', 'at']
  			]
  		});
  		//=> 'fooatunicorn'
  		slugify('foo@unicorn', {
  			customReplacements: [
  				['@', ' at ']
  			]
  		});
  		//=> 'foo-at-unicorn'
  		```
  		*/
  val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  /**
  		Convert camelcase to separate words. Internally it does `fooBar` → `foo bar`.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('fooBar');
  		//=> 'foo-bar'
  		slugify('fooBar', {decamelize: false});
  		//=> 'foobar'
  		```
  		*/
  val decamelize: js.UndefOr[Boolean] = js.native
  /**
  		Make the slug lowercase.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Déjà Vu!');
  		//=> 'deja-vu'
  		slugify('Déjà Vu!', {lowercase: false});
  		//=> 'Deja-Vu'
  		```
  		*/
  val lowercase: js.UndefOr[Boolean] = js.native
  /**
  		@default '-'
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('BAR and baz');
  		//=> 'bar-and-baz'
  		slugify('BAR and baz', {separator: '_'});
  		//=> 'bar_and_baz'
  		```
  		*/
  val separator: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomReplacements(value: js.Array[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customReplacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customReplacements")(js.undefined)
        ret
    }
    @scala.inline
    def withDecamelize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decamelize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecamelize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decamelize")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

