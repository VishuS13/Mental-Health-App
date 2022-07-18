package com.example.chromedino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

        public class MainActivity3 extends AppCompatActivity {
            RecyclerView rcv;
            myadapter adapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main3);
                setTitle("Dashboard");

                rcv = (RecyclerView) findViewById(R.id.recview);


                adapter = new myadapter(dataqueue(),getApplicationContext());
                rcv.setAdapter(adapter);

                GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
                rcv.setLayoutManager(gridLayoutManager);
            }

            public ArrayList<Model> dataqueue()
            {
                ArrayList<Model> holder=new ArrayList<>();

                Model ob1=new Model();
                ob1.setHeader("Anxiety");
                ob1.setDesc("Nervousness,Trembling,Weakness");
                ob1.setPrecaution("A mental health disorder characterised by feelings of worry, anxiety or fear that are strong enough to interfere with one's daily activities.\n" +
                        "Examples of anxiety disorders include panic attacks, obsessive-compulsive disorder and post-traumatic stress disorder.\n" +
                        "Anxiety Disorder Treatments\n" +
                        "There are many treatments to reduce and manage symptoms of anxiety disorder. Usually, people with anxiety disorder take medicine and go to counseling. \n" +
                        "\n" +
                        "Treatments for anxiety disorder include: \n" +
                        "\n" +
                        "Medication\n" +
                        "Antidepressants\n" +
                        "Bupropion\n" +
                        "Psychotherapy");
                ob1.setImgname(R.drawable.anxiety);
                holder.add(ob1);

                Model ob2=new Model();
                ob2.setHeader("Bipolar Disorder");
                ob2.setDesc("Feeling less energy,guilt");
                ob2.setPrecaution("Bipolar disorder, formerly called manic depression, is a mental health condition that causes extreme mood swings that include emotional highs (mania or hypomania) and lows (depression).\n"+
                        "If you've been diagnosed with bipolar disorder, some strategies can help prevent minor symptoms from becoming full-blown episodes of mania or depression:\n"+
                        "Pay attention to warning signs\n" +
                        "Avoid drugs and alcohol\n" +
                        "Take your medications as directed");
                ob2.setImgname(R.drawable.bd);
                holder.add(ob2);

                Model ob3=new Model();
                ob3.setHeader("Depression");
                ob3.setDesc("Anger,Frustration,Emptiness");
                ob3.setPrecaution("Depression is a mood disorder that causes a persistent feeling of sadness and loss of interest. Also called major depressive disorder or clinical depression, it affects how you feel, think and behave and can lead to a variety of emotional and physical problems. You may have trouble doing normal day-to-day activities, and sometimes you may feel as if life isn't worth living.\n"+
                        "Prevention\n" +
                        "There's no sure way to prevent depression. However, these strategies may help.\n" +
                        "\n" +
                        "Take steps to control stress, to increase your resilience and boost your self-esteem.\n" +
                        "Reach out to family and friends, especially in times of crisis, to help you weather rough spells.\n" +
                        "Get treatment at the earliest sign of a problem to help prevent depression from worsening.\n" +
                        "Consider getting long-term maintenance treatment to help prevent a relapse of symptoms.");
                ob3.setImgname(R.drawable.depression);
                holder.add(ob3);

                Model ob4=new Model();
                ob4.setHeader("Eating disorder");
                ob4.setDesc("Fatigue,Insomnia,Dizziness");
                ob4.setPrecaution("Formally classified as \"feeding and eating disorders\" in the Diagnostic and Statistical Manual of Mental Disorders (DSM-5), the term \"eating disorders\" represents a group of complex mental health conditions that can seriously impair health and social functioning.\n"+
                        "Symptoms:\n" +
                        "Dietary restriction\n" +
                        "Frequent weight changes or being significantly underweight\n" +
                        "Negative body image\n" +
                        "Presence of binge eating\n" +
                        "Presence of excessive exercise\n" +
                        "Presence of purging, laxative, or diuretic use\n" +
                        "Excessive thoughts surrounding food, body image, and weight\n"+
                        "Treatment:\n" +
                        "Self help\n" +
                        "Cognitive behavioral therapy\n" +
                        "Family based treatment\n" +
                        "Nutritional therapy\n" +
                        "Weekly outpatient treatment");
                ob4.setImgname(R.drawable.ed);
                holder.add(ob4);

                Model ob5=new Model();
                ob5.setHeader("Obsessive Compulsive Disorder");
                ob5.setDesc("Counting,Checking,Cleaning");
                ob5.setPrecaution("Excessive thoughts (obsessions) that lead to repetitive behaviours (compulsions).\n" +
                        "Obsessive-compulsive disorder is characterised by unreasonable thoughts and fears (obsessions) that lead to compulsive behaviours\n"+
                        "If you have symptoms of OCD that interfere with your daily life, you should talk to a healthcare provider. A professional who is specially trained in mental illness can offer several strategies\n"+
                        "Congnitive behavioral therapy\n" +
                        "Medication\n" +
                        "Exposure and response prevention");
                ob5.setImgname(R.drawable.ocd);
                holder.add(ob5);

                Model ob6=new Model();
                ob6.setHeader("Post Traumatic Stress Disorder");
                ob6.setDesc("Trouble in sleeping,concentrating");
                ob6.setPrecaution("A disorder characterised by failure to recover after experiencing or witnessing a terrifying event.\n" +
                        "The condition may last months or years, with triggers that can bring back memories of the trauma accompanied by intense emotional and physical reactions.\n"+
                        "Treatment:\n" +
                        "Therapy \n" +
                        "     Improve your symptoms\n" +
                        "     Teach you skills to deal with it\n" +
                        "     Restore your self-esteem\n" +
                        "\n" +
                        "Cognitive Processing Therapy\n" +
                        "Prolonged Exposure Therapy\n" +
                        "Stress Inoculation Training\n" +
                        "Eye Movement Desensitization and Reprocessing");
                ob6.setImgname(R.drawable.ptsd);
                holder.add(ob6);

                Model ob7=new Model();
                ob7.setHeader("Schizophrenia");
                ob7.setDesc("Delusions,Hallucination");
                ob7.setPrecaution("A disorder that affects a person's ability to think, feel and behave clearly.\n" +
                        "The exact cause of schizophrenia isn't known, but a combination of genetics, environment and altered brain chemistry and structure may play a role.\n"+"The goal of schizophrenia treatment is to ease the symptoms and to cut the chances of a relapse, or return of symptoms. Treatment for schizophrenia may include:\n"+
                        "Medication\n" +
                        "Psychotherapy\n" +
                        "Coordinated speciality care\n" +
                        "Electroconvulsive therapy");
                ob7.setImgname(R.drawable.schizophrenia);
                holder.add(ob7);


                return holder;
            }


        }