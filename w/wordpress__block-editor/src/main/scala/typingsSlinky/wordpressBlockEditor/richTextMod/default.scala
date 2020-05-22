package typingsSlinky.wordpressBlockEditor.richTextMod

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.Props
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.applet
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.base
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.basefont
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.bdi
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.bdo
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.blockquote
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.body
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.br
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.button
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.canvas
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.caption
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.cite
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.code
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.col
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.colgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dir
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.font
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.frame
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.frameset
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h6
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.head
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.header
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.html
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.i
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.iframe
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.img
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.input
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ins
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.kbd
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.label
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.legend
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.main
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.map
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.mark
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.marquee
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.meta
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.nav
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.noscript
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ol
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.optgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.option
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.output
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.p
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.param
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.picture
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.pre
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.progress
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.q
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.rp
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.rt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ruby
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.s
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.samp
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.script
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.section
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.select
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.slot
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.small
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.source
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.span
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.strong
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.style
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.sub
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.summary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.sup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.table
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tbody
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.td
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.template
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.textarea
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tfoot
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.th
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.thead
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.title
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.track
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.u
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ul
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.video
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.wbr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/rich-text", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(
    props: Props[
      a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
    ]
  ): ReactElement = js.native
  /**
    * Should be used in the `save` function of your block to correctly save rich text content.
    */
  @JSName("Content")
  def Content_a(props: ContentProps[a]): ReactElement = js.native
  @JSName("Content")
  def Content_abbr(props: ContentProps[abbr]): ReactElement = js.native
  @JSName("Content")
  def Content_address(props: ContentProps[address]): ReactElement = js.native
  @JSName("Content")
  def Content_applet(props: ContentProps[applet]): ReactElement = js.native
  @JSName("Content")
  def Content_area(props: ContentProps[area]): ReactElement = js.native
  @JSName("Content")
  def Content_article(props: ContentProps[article]): ReactElement = js.native
  @JSName("Content")
  def Content_aside(props: ContentProps[aside]): ReactElement = js.native
  @JSName("Content")
  def Content_audio(props: ContentProps[audio]): ReactElement = js.native
  @JSName("Content")
  def Content_b(props: ContentProps[b]): ReactElement = js.native
  @JSName("Content")
  def Content_base(props: ContentProps[base]): ReactElement = js.native
  @JSName("Content")
  def Content_basefont(props: ContentProps[basefont]): ReactElement = js.native
  @JSName("Content")
  def Content_bdi(props: ContentProps[bdi]): ReactElement = js.native
  @JSName("Content")
  def Content_bdo(props: ContentProps[bdo]): ReactElement = js.native
  @JSName("Content")
  def Content_blockquote(props: ContentProps[blockquote]): ReactElement = js.native
  @JSName("Content")
  def Content_body(props: ContentProps[body]): ReactElement = js.native
  @JSName("Content")
  def Content_br(props: ContentProps[br]): ReactElement = js.native
  @JSName("Content")
  def Content_button(props: ContentProps[button]): ReactElement = js.native
  @JSName("Content")
  def Content_canvas(props: ContentProps[canvas]): ReactElement = js.native
  @JSName("Content")
  def Content_caption(props: ContentProps[caption]): ReactElement = js.native
  @JSName("Content")
  def Content_cite(props: ContentProps[cite]): ReactElement = js.native
  @JSName("Content")
  def Content_code(props: ContentProps[code]): ReactElement = js.native
  @JSName("Content")
  def Content_col(props: ContentProps[col]): ReactElement = js.native
  @JSName("Content")
  def Content_colgroup(props: ContentProps[colgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_data(props: ContentProps[data]): ReactElement = js.native
  @JSName("Content")
  def Content_datalist(props: ContentProps[datalist]): ReactElement = js.native
  @JSName("Content")
  def Content_dd(props: ContentProps[dd]): ReactElement = js.native
  @JSName("Content")
  def Content_del(props: ContentProps[del]): ReactElement = js.native
  @JSName("Content")
  def Content_details(props: ContentProps[details]): ReactElement = js.native
  @JSName("Content")
  def Content_dfn(props: ContentProps[dfn]): ReactElement = js.native
  @JSName("Content")
  def Content_dialog(props: ContentProps[dialog]): ReactElement = js.native
  @JSName("Content")
  def Content_dir(props: ContentProps[dir]): ReactElement = js.native
  @JSName("Content")
  def Content_div(props: ContentProps[div]): ReactElement = js.native
  @JSName("Content")
  def Content_dl(props: ContentProps[dl]): ReactElement = js.native
  @JSName("Content")
  def Content_dt(props: ContentProps[dt]): ReactElement = js.native
  @JSName("Content")
  def Content_em(props: ContentProps[em]): ReactElement = js.native
  @JSName("Content")
  def Content_embed(props: ContentProps[embed]): ReactElement = js.native
  @JSName("Content")
  def Content_fieldset(props: ContentProps[fieldset]): ReactElement = js.native
  @JSName("Content")
  def Content_figcaption(props: ContentProps[figcaption]): ReactElement = js.native
  @JSName("Content")
  def Content_figure(props: ContentProps[figure]): ReactElement = js.native
  @JSName("Content")
  def Content_font(props: ContentProps[font]): ReactElement = js.native
  @JSName("Content")
  def Content_footer(props: ContentProps[footer]): ReactElement = js.native
  @JSName("Content")
  def Content_form(props: ContentProps[form]): ReactElement = js.native
  @JSName("Content")
  def Content_frame(props: ContentProps[frame]): ReactElement = js.native
  @JSName("Content")
  def Content_frameset(props: ContentProps[frameset]): ReactElement = js.native
  @JSName("Content")
  def Content_h1(props: ContentProps[h1]): ReactElement = js.native
  @JSName("Content")
  def Content_h2(props: ContentProps[h2]): ReactElement = js.native
  @JSName("Content")
  def Content_h3(props: ContentProps[h3]): ReactElement = js.native
  @JSName("Content")
  def Content_h4(props: ContentProps[h4]): ReactElement = js.native
  @JSName("Content")
  def Content_h5(props: ContentProps[h5]): ReactElement = js.native
  @JSName("Content")
  def Content_h6(props: ContentProps[h6]): ReactElement = js.native
  @JSName("Content")
  def Content_head(props: ContentProps[head]): ReactElement = js.native
  @JSName("Content")
  def Content_header(props: ContentProps[header]): ReactElement = js.native
  @JSName("Content")
  def Content_hgroup(props: ContentProps[hgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_hr(props: ContentProps[hr]): ReactElement = js.native
  @JSName("Content")
  def Content_html(props: ContentProps[html]): ReactElement = js.native
  @JSName("Content")
  def Content_i(props: ContentProps[i]): ReactElement = js.native
  @JSName("Content")
  def Content_iframe(props: ContentProps[iframe]): ReactElement = js.native
  @JSName("Content")
  def Content_img(props: ContentProps[img]): ReactElement = js.native
  @JSName("Content")
  def Content_input(props: ContentProps[input]): ReactElement = js.native
  @JSName("Content")
  def Content_ins(props: ContentProps[ins]): ReactElement = js.native
  @JSName("Content")
  def Content_kbd(props: ContentProps[kbd]): ReactElement = js.native
  @JSName("Content")
  def Content_label(props: ContentProps[label]): ReactElement = js.native
  @JSName("Content")
  def Content_legend(props: ContentProps[legend]): ReactElement = js.native
  @JSName("Content")
  def Content_li(props: ContentProps[li]): ReactElement = js.native
  @JSName("Content")
  def Content_link(props: ContentProps[link]): ReactElement = js.native
  @JSName("Content")
  def Content_main(props: ContentProps[main]): ReactElement = js.native
  @JSName("Content")
  def Content_map(props: ContentProps[map]): ReactElement = js.native
  @JSName("Content")
  def Content_mark(props: ContentProps[mark]): ReactElement = js.native
  @JSName("Content")
  def Content_marquee(props: ContentProps[marquee]): ReactElement = js.native
  @JSName("Content")
  def Content_menu(props: ContentProps[menu]): ReactElement = js.native
  @JSName("Content")
  def Content_meta(props: ContentProps[meta]): ReactElement = js.native
  @JSName("Content")
  def Content_meter(props: ContentProps[meter]): ReactElement = js.native
  @JSName("Content")
  def Content_nav(props: ContentProps[nav]): ReactElement = js.native
  @JSName("Content")
  def Content_noscript(props: ContentProps[noscript]): ReactElement = js.native
  @JSName("Content")
  def Content_object(props: ContentProps[`object`]): ReactElement = js.native
  @JSName("Content")
  def Content_ol(props: ContentProps[ol]): ReactElement = js.native
  @JSName("Content")
  def Content_optgroup(props: ContentProps[optgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_option(props: ContentProps[option]): ReactElement = js.native
  @JSName("Content")
  def Content_output(props: ContentProps[output]): ReactElement = js.native
  @JSName("Content")
  def Content_p(props: ContentProps[p]): ReactElement = js.native
  @JSName("Content")
  def Content_param(props: ContentProps[param]): ReactElement = js.native
  @JSName("Content")
  def Content_picture(props: ContentProps[picture]): ReactElement = js.native
  @JSName("Content")
  def Content_pre(props: ContentProps[pre]): ReactElement = js.native
  @JSName("Content")
  def Content_progress(props: ContentProps[progress]): ReactElement = js.native
  @JSName("Content")
  def Content_q(props: ContentProps[q]): ReactElement = js.native
  @JSName("Content")
  def Content_rp(props: ContentProps[rp]): ReactElement = js.native
  @JSName("Content")
  def Content_rt(props: ContentProps[rt]): ReactElement = js.native
  @JSName("Content")
  def Content_ruby(props: ContentProps[ruby]): ReactElement = js.native
  @JSName("Content")
  def Content_s(props: ContentProps[s]): ReactElement = js.native
  @JSName("Content")
  def Content_samp(props: ContentProps[samp]): ReactElement = js.native
  @JSName("Content")
  def Content_script(props: ContentProps[script]): ReactElement = js.native
  @JSName("Content")
  def Content_section(props: ContentProps[section]): ReactElement = js.native
  @JSName("Content")
  def Content_select(props: ContentProps[select]): ReactElement = js.native
  @JSName("Content")
  def Content_slot(props: ContentProps[slot]): ReactElement = js.native
  @JSName("Content")
  def Content_small(props: ContentProps[small]): ReactElement = js.native
  @JSName("Content")
  def Content_source(props: ContentProps[source]): ReactElement = js.native
  @JSName("Content")
  def Content_span(props: ContentProps[span]): ReactElement = js.native
  @JSName("Content")
  def Content_strong(props: ContentProps[strong]): ReactElement = js.native
  @JSName("Content")
  def Content_style(props: ContentProps[style]): ReactElement = js.native
  @JSName("Content")
  def Content_sub(props: ContentProps[sub]): ReactElement = js.native
  @JSName("Content")
  def Content_summary(props: ContentProps[summary]): ReactElement = js.native
  @JSName("Content")
  def Content_sup(props: ContentProps[sup]): ReactElement = js.native
  @JSName("Content")
  def Content_table(props: ContentProps[table]): ReactElement = js.native
  @JSName("Content")
  def Content_tbody(props: ContentProps[tbody]): ReactElement = js.native
  @JSName("Content")
  def Content_td(props: ContentProps[td]): ReactElement = js.native
  @JSName("Content")
  def Content_template(props: ContentProps[template]): ReactElement = js.native
  @JSName("Content")
  def Content_textarea(props: ContentProps[textarea]): ReactElement = js.native
  @JSName("Content")
  def Content_tfoot(props: ContentProps[tfoot]): ReactElement = js.native
  @JSName("Content")
  def Content_th(props: ContentProps[th]): ReactElement = js.native
  @JSName("Content")
  def Content_thead(props: ContentProps[thead]): ReactElement = js.native
  @JSName("Content")
  def Content_time(props: ContentProps[time]): ReactElement = js.native
  @JSName("Content")
  def Content_title(props: ContentProps[title]): ReactElement = js.native
  @JSName("Content")
  def Content_tr(props: ContentProps[tr]): ReactElement = js.native
  @JSName("Content")
  def Content_track(props: ContentProps[track]): ReactElement = js.native
  @JSName("Content")
  def Content_u(props: ContentProps[u]): ReactElement = js.native
  @JSName("Content")
  def Content_ul(props: ContentProps[ul]): ReactElement = js.native
  @JSName("Content")
  def Content_var(props: ContentProps[`var`]): ReactElement = js.native
  @JSName("Content")
  def Content_video(props: ContentProps[video]): ReactElement = js.native
  @JSName("Content")
  def Content_wbr(props: ContentProps[wbr]): ReactElement = js.native
  def isEmpty(value: String): Boolean = js.native
  def isEmpty(value: js.Array[String]): Boolean = js.native
}

