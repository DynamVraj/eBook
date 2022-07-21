package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JournalActivity extends AppCompatActivity implements View.OnClickListener{
    public ImageView j1;
    public ImageView j2;
    public ImageView j3;
    public ImageView j4;
    public ImageView j5;
    public ImageView j6;
    public ImageView j7;
    public ImageView j8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
        j1 = (ImageView) findViewById(R.id.btnj1);
        j1.setOnClickListener(this);
        j2 = (ImageView) findViewById(R.id.btnj2);
        j2.setOnClickListener(this);
        j3 = (ImageView) findViewById(R.id.btnj3);
        j3.setOnClickListener(this);
        j4 = (ImageView) findViewById(R.id.btnj4);
        j4.setOnClickListener(this);
        j5 = (ImageView) findViewById(R.id.btnj5);
        j5.setOnClickListener(this);
        j6 = (ImageView) findViewById(R.id.btnj6);
        j6.setOnClickListener(this);
        j7 = (ImageView) findViewById(R.id.btnj7);
        j7.setOnClickListener(this);
        j8 = (ImageView) findViewById(R.id.btnj8);
        j8.setOnClickListener(this);
    }
    public void onClick(View v) {
        int id=v.getId();
        switch(id) {
            case R.id.btnj1:
                String url1 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c7d142c752735f503debd6983d990d0f7a3ce265c4aa491af0ead942aa81c5070e19ef2a2eb0bb48cc18b672bad73e187ffbf05ced8a359dcc170cbe15c85e5c326e5a096b2eb2b2471028ccaf61ca662c4c186cdd3846fd8de43a8ede9ed60d65bf341e06eb45e207262a136a28c0b2313204c228df1f6c7e9dc9d5a5bce6ba2e912acae27475063d8500f84dafd3365cc5fd05ebc8ba54561b0783f919ab2e470af77903af6118985805dc8ae4c93b174c66c11dc173efb759dc9d00a179dcae7f52a92521998e1301c92cd62af16cf984315e0bf86348525ac043bebc2916ebbf9c7ca44da12b31db87aabf0004fdb18981cd2ca151607e2e2954f6ffcd96b";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url1)));
                break;
            case R.id.btnj2:
                String url2 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c3149ddec6b03142c4fd4bb4d31d818de7446c6025f9d27534fbefb6967a593890109cedb8764fd7eeeaeb33357b2e1936acdc2305e4100c2882eab8587773aaae4186a95383ea0b2b49f68933bde9893f9d5c62c252783967ca5e9b5a49a3d2b8c96755144328d00b36c57b59ef00ffca6d3d7a00ea686092a5f776a3b3b1536f12e60ff87812cfda443335d4b982bf82de9c7b60066abffa869735e5782753bb1944ce678aa078d5a8850407ed313f993cfa6e0371fdd5d985a94d0c9588096f9306c7fa96c7cdc20b22df4e22911089ab27d25be819fea706fcd487f899015215a5a8dd14dc2d76470b4e480a41dcd7e407ad6a7b44af9a324e689ae471a35";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url2)));
                break;
            case R.id.btnj3:
                String url3 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c7cd4188d6221304d040719780ce1d4539c0738b94c1219df4e050f730fb527945cc10d7ee9add00bea96b33ba19cba9bc40033bbe56882e0606ae1146f095e3139c2f53d0b76ed0d9bdefeae8d89498fdb709c0ed9ef03dd5d286c63fef6df81381b2c254addb31089dd9a2c12e9782040bf76f840b5340c50246d06ff07f8d31d3c54f2191e20e00b7f83c25d34e90df4b8cd298c0b31d7aa1e0235b578c2d1e1734dbc64ef065a16420efeba8a1249372a0dcef58cd49bb9c4883f7aa14d318cb4d86316ceccb0414a4557974001dc7b7ab66df598d8f15a2595574647dff2ed88b3296b6cc4635e1eda1831c5a8451ac9fcd890bcd5c0";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url3)));
                break;
            case R.id.btnj4:
                String url4 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c55ee654abafc9a93bca1126d8efee35987ab15a5e0975dc2886a54ade82083cd18a5081fa87a32da2b877585aa5079f099499b77d0c6f6dc86c0ad9caac254a4899737ef9ce2891e5b058a1b5522d0f424f7f0bcb25258166c0e0ef8b0eb9b8de34c051b81458586a70c3717e434281c9ee74ecdb530a31ae9b93d6228a185c2eb0056b96cd731f1b905bb3d4f42f2f42ed47fcfa0b65eba6411605deae8ad46257a1ca65dc7df1b8fd03d0a22cc9aeb9d4ff3a3dd90d78b2b272da1412d863d3f37bf379a40a8c3334770abaeb323ab95b0029fa1631eb3b0da16a5c0ef3268896ceb72f1127214ab2ebb96a48fbff65a3ecdf99c9803cfb1394a4760c1f42a";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url4)));
                break;
            case R.id.btnj5:
                String url5 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c7cd4188d6221304d150c3cf62bd70aaf6d0d18a666f716a466a4024e43d75a49e09567acf75e7b6e7fa37d48bc927eaee0c423e128412d938bed8f589d5033fb8af610db107b5af01b6082533c3f7d2b5e4950971ee63393d7fe4bc9bb245cc183338bf0fe09743586dab8f4025929a6ae4fb54ec722e009524abfdb10625777b9705bbb761e470eaa083e932f2f8545aceac51ca15d22cf58a5cc92f32e67e335a8c3fbbc944d7d0c85d9a3cf507d83c34ebf8e7acbcc550b1d56a4c7187f038dfc02029eb38c1c2ad0ef8ad8f16bbe99ed7cb618dea2bf88ade3f7cae9ab288307c1c6342a34632d39094719f5d4c2a35202ad0b9e0e875cdb312a590abf0e";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url5)));
                break;
            case R.id.btnj6:
                String url6 = "https://ovidsp.dc1.ovid.com/ovid-b/ovidweb.cgi?QS2=434f4e1a73d37e8c7cd4188d6221304d25a23a9359e24ffa9b84a824bfbaefbdfde68984b8cdee10fefd346d178f933d3e261649754b0199b8aca374e0a9089229c801475854738481c856956aefffd16558c904164f87f56e589b638b65cf30ed98b0d6810da827f9997ce0580f39fc5bcc4f24d947f709982264c5f8757223fd5cf8ff6b16e90485345ba01a03f0b817bf7976e4d049f38c16bf3f11511e3e2174f05fce69c2c5da64b1bbe7de72e5613664a8af57a2334fef5324f128349197b3bda4ce8f182bad6347c4ec0859106b4c450c85b3a8d095806f59d00b66c156320fd952e163d6dc7ee5e8d6da20bddd7323276e61d6994d5e780522082bc1a237cde0f05575df";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url6)));
                break;
            case R.id.btnj7:
                String url7 = "https://journals.lww.com/ijo/pages/default.aspx";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url7)));
                break;
            case R.id.btnj8:
                String url8 = "https://www.ijoreports.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url8)));
                break;
        }
    }
}