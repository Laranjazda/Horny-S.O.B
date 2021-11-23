package com.hsob.HornySOB.service;

import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import com.hsob.HornySOB.repository.ListingsAndReviewsRepository;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

@Service
public class ListingsAndReviewsService {
    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;
    @Autowired
    ListingsAndReviews listingsAndReviews;

    public Object getById(String _id){
        return listingsAndReviewsRepository.findById(_id);
    }

    public Object getData(){
        JSONObject n = new JSONObject();
        n.put("_id", 1);
        n.put("listing_url", 1);
        n.put("calendar_last_scraped", 1);
        n.put("amenities", 1);
        n.put("host", 1);

        return n;
    }

//    public class Conexao {
//
//        private Mongo conexao;
//        private DB db;
//
//        public void addPessoa(Contato c) throws UnknownHostException, MongoException {
//            this.conexao = new Mongo("localhost");
//            this.db = conexao.getDB("sample_airbnb");
//
//            try {
//                BasicDBObject pessoa = new BasicDBObject();
//                pessoa.put("nome", c.getNome());
//                pessoa.put("idade", c.getIdade());
//                pessoa.put("telefone", c.getTelefone());
//                pessoa.put("endereco", c.getEndereco());
//                pessoa.put("email", c.getEmail());
//
//                DBCollection col = db.getCollection("sample_airbnb");
//                col.insert(pessoa);
//
//            } catch(Exception e){
//                System.err.println(e.getClass().getName() + ", " + e.getMessage());
//
//            }
//        }
//
//        public void buscar() throws UnknownHostException, MongoException {
//            this.conexao = new Mongo("localhost");
//            this.db = conexao.getDB("sample_airbnb");
//
//            try {
//                DBCursor cursor = db.getCollection("sample_airbnb").find();
//                System.out.println("---");
//                while(cursor.hasNext()) {
//                    BasicDBObject pessoa = (BasicDBObject) cursor.next();
//                    System.out.println("Nome " + pessoa.getString("nome"));
//                    System.out.println("Idade " + pessoa.getInt("idade"));
//                    System.out.println("Telefone " + pessoa.getInt("telefone"));
//                    System.out.println("Endereco " + pessoa.getString("endereco"));
//                    System.out.println("Email " + pessoa.getString("email"));
//                    System.out.println("----");
//                }
//            } catch(Exception e){
//                System.err.println(e.getClass().getName() + ", " + e.getMessage());
//
//            }
//        }
//
//    }



}
